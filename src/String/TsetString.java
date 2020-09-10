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
		String  ss = "财关税[2016]62号及[2018]60号";
		System.out.println(subStringByByte(ss, 30));
		
		String zz = "234.。您qq";
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
					int n = 0; // 表示当前的字节数
					int i = 2; // 要截取的字节数，从第3个字节开始
					// int i = 0; // 要截取的字节数，从第3个字节开始
					for (; i < bytes.length && n < length; i++)
					{ // 奇数位置，如3、5、7等，为UCS2编码中两个字节的第二个字节
						if (i % 2 == 1)
						{
							n++; // 在UCS2第二个字节时n加1
						} else
						{ // 当UCS2编码的第一个字节不等于0时，该UCS2字符为汉字，一个汉字算两个字节
							if (bytes[i] != 0)
							{
								n++;
							}
						}
					}
					// 如果i为奇数时，处理成偶数
					if (i % 2 == 1)
					{ // 该UCS2字符是汉字时，去掉这个截一半的汉字
						if (bytes[i - 1] != 0)
						{
							i = i - 1;
						} // 该UCS2字符是字母或数字，则保留该字符
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
