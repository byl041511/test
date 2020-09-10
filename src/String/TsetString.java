package String;

import java.io.UnsupportedEncodingException;


public class TsetString {

	private static String unicode = "Unicode";
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		String  aa = "1234567890.pd";
//		System.out.println(aa.substring(3));
//		System.out.println(aa.indexOf(".pdf"));
//		System.out.println(aa.substring(0,aa.indexOf(".pdf")));
//		String bb = "\u4E0D\u652F\u6301\u6B64\u7C7B\u578B";
//		System.out.println(bb);
//		System.out.println(bb +"--\u5B57\u6BB5\u8F6C\u6362\u6210\u62A5\u6587\u5931\u8D25");
		String  ss = "�ƹ�˰[2016]62�ż�[2018]60��";
		System.out.println(subStringByByte(ss, 30));
		
		String zz = "234.����qq";
		System.out.println(cutString(zz, 4));
	}
	
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
	  
		public static String cutString(String s, int length) throws UnsupportedEncodingException
		{
			if (s != null)
			{
				if (!"".equals(s))
				{
					byte[] bytes = s.getBytes(unicode);
					int n = 0; // ��ʾ��ǰ���ֽ���
					int i = 2; // Ҫ��ȡ���ֽ������ӵ�3���ֽڿ�ʼ
					// int i = 0; // Ҫ��ȡ���ֽ������ӵ�3���ֽڿ�ʼ
					for (; i < bytes.length && n < length; i++)
					{ // ����λ�ã���3��5��7�ȣ�ΪUCS2�����������ֽڵĵڶ����ֽ�
						if (i % 2 == 1)
						{
							n++; // ��UCS2�ڶ����ֽ�ʱn��1
						} else
						{ // ��UCS2����ĵ�һ���ֽڲ�����0ʱ����UCS2�ַ�Ϊ���֣�һ�������������ֽ�
							if (bytes[i] != 0)
							{
								n++;
							}
						}
					}
					// ���iΪ����ʱ�������ż��
					if (i % 2 == 1)
					{ // ��UCS2�ַ��Ǻ���ʱ��ȥ�������һ��ĺ���
						if (bytes[i - 1] != 0)
						{
							i = i - 1;
						} // ��UCS2�ַ�����ĸ�����֣��������ַ�
						else
						{
							i = i + 1;
						}
					}
					String string = new String(bytes, 0, i, unicode);
					int len = string.getBytes("GBK").length;
					if (length > len)
					{
						string += " ";
					}
					return string;
				}
				return "";
			}
			return null;
		}

}
