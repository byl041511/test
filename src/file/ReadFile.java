package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ReadFile {

	private static final int BUFFER_SIZE = 2 * 1024;
	/**
	 * �Ƿ���ԭ����Ŀ¼�ṹ
	 * true:  ����Ŀ¼�ṹ;
	 * false: �����ļ��ܵ�ѹ������Ŀ¼��(ע�⣺������Ŀ¼�ṹ���ܻ����ͬ���ļ�,��ѹ��ʧ��)
	 */
	private static final boolean KeepDirStructure = true;

	public static void main(String[] args) {
		String filepath = "E://test";
        File file = new File(filepath);
        if (!file.isDirectory()) {
                System.out.println("�ļ�");
                System.out.println("path=" + file.getPath());
                System.out.println("absolutepath=" + file.getAbsolutePath());
                System.out.println("name=" + file.getName());

        } else if (file.isDirectory()) {
                System.out.println("�ļ���");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                        File readfile = new File(filepath + "\\" + filelist[i]);
                        if (!readfile.isDirectory()) {
                                System.out.println("path=" + readfile.getPath());
                                System.out.println("absolutepath=" + readfile.getAbsolutePath());
                                System.out.println("name=" + readfile.getName());
                                String suffix = readfile.getName().substring(readfile.getName().lastIndexOf(".") + 1);
                                System.out.println(suffix);
                                if ("zip".equals(suffix)) {
									System.out.println("�ļ�Ϊѹ����");
									try {
										unZipFiles(readfile.getPath(),filepath+"\\"+"qqq");
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
                        } else if (readfile.isDirectory()) {
//                                readfile(filepath + "\\" + filelist[i]);
                        }
                }

        }
	}
	
	
	
	
	/**
	 * ѹ����ZIP
	 * @param srcDir         ѹ�� �ļ�/�ļ��� ·��
	 * @param outPathFile    ѹ�� �ļ�/�ļ��� ���·��+�ļ��� D:/xx.zip
	 * @param isDelSrcFile   �Ƿ�ɾ��ԭ�ļ�: ѹ��ǰ�ļ�
	 */
	public static void toZip(String srcDir, String outPathFile,boolean isDelSrcFile) throws Exception {
		long start = System.currentTimeMillis();
		FileOutputStream out = null; 
		ZipOutputStream zos = null;
		try {
			out = new FileOutputStream(new File(outPathFile));
			zos = new ZipOutputStream(out);
			File sourceFile = new File(srcDir);
			if(!sourceFile.exists()){
				throw new Exception("��ѹ���ļ������ļ��в�����");
			}
			compress(sourceFile, zos, sourceFile.getName());
			if(isDelSrcFile){
				delDir(srcDir);
			}
			System.out.printf("ԭ�ļ�:{}. ѹ����:{}���. �Ƿ�ɾ��ԭ�ļ�:{}. ��ʱ:{}ms. ",srcDir,outPathFile,isDelSrcFile,System.currentTimeMillis()-start);
		} catch (Exception e) {
			System.out.printf("zip error from ZipUtils: {}. ",e.getMessage());
			throw new Exception("zip error from ZipUtils");
		} finally {
			try {
				if (zos != null) {zos.close();}
				if (out != null) {out.close();}
			} catch (Exception e) {}
		}
	}

	/**
	 * �ݹ�ѹ������
	 * @param sourceFile Դ�ļ�
	 * @param zos zip�����
	 * @param name ѹ���������
	 */
	private static void compress(File sourceFile, ZipOutputStream zos, String name)
			throws Exception {
		byte[] buf = new byte[BUFFER_SIZE];
		if (sourceFile.isFile()) {
			zos.putNextEntry(new ZipEntry(name));
			int len;
			FileInputStream in = new FileInputStream(sourceFile);
			while ((len = in.read(buf)) != -1) {
				zos.write(buf, 0, len);
			}
			zos.closeEntry();
			in.close();
		} else {
			File[] listFiles = sourceFile.listFiles();
			if (listFiles == null || listFiles.length == 0) {
				if (KeepDirStructure) {
					zos.putNextEntry(new ZipEntry(name + "/"));
					zos.closeEntry();
				}
			} else {
				for (File file : listFiles) {
					if (KeepDirStructure) {
						compress(file, zos, name + "/" + file.getName());
					} else {
						compress(file, zos, file.getName());
					}
				}
			}
		}
	}
	
	/**
	 * ��ѹ�ļ���ָ��Ŀ¼
	 */
	@SuppressWarnings({ "rawtypes", "resource" })
	public static void unZipFiles(String zipPath, String descDir) throws IOException {
		System.out.println("�ļ�:{}."+zipPath+" ��ѹ·��:{}."+descDir+" ��ѹ��ʼ.");
		long start = System.currentTimeMillis();
		try{
			File zipFile = new File(zipPath);
			System.err.println(zipFile.getName());
			if(!zipFile.exists()){
				throw new IOException("���ѹ�ļ�������.");
			}
			File pathFile = new File(descDir);
			if (!pathFile.exists()) {
				pathFile.mkdirs();
			}
			ZipFile zip = new ZipFile(zipFile, Charset.forName("GBK"));
			for (Enumeration entries = zip.entries(); entries.hasMoreElements();) {
				ZipEntry entry = (ZipEntry) entries.nextElement();
				String zipEntryName = entry.getName();
				System.err.println(zipEntryName);
				InputStream in = zip.getInputStream(entry);
				String outPath = (descDir + File.separator + zipEntryName).replaceAll("\\*", "/");
				System.err.println(outPath);
				// �ж�·���Ƿ����,�������򴴽��ļ�·��
//				File file = new File(outPath.substring(0, outPath.lastIndexOf('/')));
				File file = new File(descDir);
				if (!file.exists()) {
					file.mkdirs();
				}
				// �ж��ļ�ȫ·���Ƿ�Ϊ�ļ���,����������Ѿ��ϴ�,����Ҫ��ѹ
				if (new File(outPath).isDirectory()) {
					continue;
				}
				// ����ļ�·����Ϣ
				OutputStream out = new FileOutputStream(outPath);
				byte[] buf1 = new byte[1024];
				int len;
				while ((len = in.read(buf1)) > 0) {
					out.write(buf1, 0, len);
				}
				in.close();
				out.close();
			}
			System.out.printf("�ļ�:{}. ��ѹ·��:{}. ��ѹ���. ��ʱ:{}ms. ",zipPath,descDir,System.currentTimeMillis()-start);
		}catch(Exception e){
			System.out.printf("�ļ�:{}. ��ѹ·��:{}. ��ѹ�쳣:{}. ��ʱ:{}ms. ",zipPath,descDir,e,System.currentTimeMillis()-start);
			throw new IOException(e);
		}
	}
	
	// ɾ���ļ����ļ����Լ��ļ����������ļ�
	public static void delDir(String dirPath) throws IOException {
		System.out.printf("ɾ���ļ���ʼ:{}.",dirPath);
		long start = System.currentTimeMillis();
		try{
			File dirFile = new File(dirPath);
			if (!dirFile.exists()) {
				return;
			}
			if (dirFile.isFile()) {
				dirFile.delete();
				return;
			}
			File[] files = dirFile.listFiles();
			if(files==null){
				return;
			}
			for (int i = 0; i < files.length; i++) {
				delDir(files[i].toString());
			}
			dirFile.delete();
			System.out.printf("ɾ���ļ�:{}. ��ʱ:{}ms. ",dirPath,System.currentTimeMillis()-start);
		}catch(Exception e){
			System.out.printf("ɾ���ļ�:{}. �쳣:{}. ��ʱ:{}ms. ",dirPath,e,System.currentTimeMillis()-start);
			throw new IOException("ɾ���ļ��쳣.");
		}
	}

}
