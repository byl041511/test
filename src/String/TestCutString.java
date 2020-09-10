package String;

import java.io.UnsupportedEncodingException;


public class TestCutString {
	private static String unicode = "Unicode";
	public static void main(String[] args) throws UnsupportedEncodingException {
		String aa = "����¡��͵�˹��MarioBadescu�󴽸�10.4g/��ʿ��Vaseline�󴽸�7.4g/��ʿ��Vaseline�󴽸�7.4g*3/����ͼYiyatoo�󴽸�8.5G/��ŵʫKORRES�󴽸�6.2g";
//		String bb = cutString(aa,50);
//		System.out.println(bb);
//		System.out.println(subStrByLength(aa, 50));
//		System.out.println(subStringByByte(aa, 50));
//		System.out.println(subStringByByte("111111", 50));
//		System.out.println(subStringByByte(aa, 50).getBytes("GBK").length);
//		System.out.println(bb.getBytes("GBK").length);
//		System.out.println("��".getBytes("GBK").length);
//		System.out.println("��".getBytes(unicode).length);
//		System.out.println("��".getBytes("utf-8").length);
//		System.out.println("a".getBytes("GBK").length);
//		System.out.println("a".getBytes("utf-8").length);
//		System.out.println("��".getBytes("GBK").length);
//		System.out.println("��".getBytes("GBK").length);
//		System.out.println(subStringByByte("�ظ���Ҷ�", 9));
//		System.out.println(subStringByByte("�ظ���Ҷ�", 9).getBytes("GBK").length);
//		System.out.println(cutString("111111", 50));
//		System.out.println(cutString("111111", 50).getBytes("GBK").length);
//		
//
//		System.out.println("��".getBytes("GBK").length);
//		System.out.println(cutString("111111", 50).getBytes("GBK").length);
//		
//		System.out.println("����°͵�".getBytes(unicode).length);
//		System.out.println("����°͵�".getBytes("GBK").length);
		String cc = "�õ�aA";
		System.out.println(cutString(cc,5));
	}
	public static String cutString(String s, int length)
			throws UnsupportedEncodingException {
		if (s != null) {
			if (!"".equals(s)) {
				byte[] bytes = s.getBytes(unicode);
				int n = 0; // ��ʾ��ǰ���ֽ���
				int i = 2; // Ҫ��ȡ���ֽ������ӵ�3���ֽڿ�ʼ
				// int i = 0; // Ҫ��ȡ���ֽ������ӵ�3���ֽڿ�ʼ
				for (; i < bytes.length && n < length; i++) { // ����λ�ã���3��5��7�ȣ�ΪUCS2�����������ֽڵĵڶ����ֽ�
					System.out.println(bytes[i]);
					if (i % 2 == 1) {
						n++; // ��UCS2�ڶ����ֽ�ʱn��1
					} else { // ��UCS2����ĵ�һ���ֽڲ�����0ʱ����UCS2�ַ�Ϊ���֣�һ�������������ֽ�
						if (bytes[i] != 0) {
							n++;
						}
					}
				}
				// ���iΪ����ʱ�������ż��
				if (i % 2 == 1) { // ��UCS2�ַ��Ǻ���ʱ��ȥ�������һ��ĺ���
					if (bytes[i - 1] != 0) {
						i = i - 1;
					} // ��UCS2�ַ�����ĸ�����֣��������ַ�
					else {
						i = i + 1;
					}
				}
				String string = new String(bytes, 0, i, unicode);
				int len = string.getBytes("GBK").length;
				if (length > len) {
					string += " ";
				}
				return string;

			}
			return "";
		}
		return null;
	}
	public static String subStrByLength(String value, int length) {

		int valueLength = 0;
		StringBuffer subValue = new StringBuffer("");
		String chinese = "[\u0391-\uFFE5]";
		/* ��ȡ�ֶ�ֵ�ĳ��ȣ�����������ַ�����ÿ�������ַ�����Ϊ2������Ϊ1 */
		for (int i = 0; i < value.length(); i++) {
			/* ��ȡһ���ַ� */
			String temp = value.substring(i, i + 1);
			/* �ж��Ƿ�Ϊ�����ַ� */
			if (temp.matches(chinese)) {
				/* �����ַ�����2���ֽڼ��� */
				valueLength += 2;
			} else {
				/* �����ַ�����Ϊ1 */
				valueLength += 1;
			}
			subValue.append(temp);
			if(valueLength>=length){
				return subValue.toString();
			}
		}
		return subValue.toString();
	}
	

		/**
		 * �ַ�����ȡ
		 * @param str ԭʼ�ַ���
		 * @param subcount ��ȡ�ĳ���
		 * @return
		 */
		 public static String subStringByByte(String str,int subcount)
		  {
			  int reInt=0;
			  String reStr="";
			  if(str==null)
			  {
				  return "";
			  }
			  char[] tmpChar=str.toCharArray();
			  for (int i = 0; (i<str.length() && subcount>reInt); i++) {
				  String s=str.valueOf(tmpChar[i]);
				  byte[] b=s.getBytes();
				  reInt+=b.length;
				  reStr+=tmpChar[i];
			  }
			  return reStr;
		  }


}
