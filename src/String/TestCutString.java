package String;

import java.io.UnsupportedEncodingException;


public class TestCutString {
	private static String unicode = "Unicode";
	public static void main(String[] args) throws UnsupportedEncodingException {
		String aa = "马里奥·巴德斯库MarioBadescu润唇膏10.4g/凡士林Vaseline润唇膏7.4g/凡士林Vaseline润唇膏7.4g*3/易雅图Yiyatoo润唇膏8.5G/珂诺诗KORRES润唇膏6.2g";
//		String bb = cutString(aa,50);
//		System.out.println(bb);
//		System.out.println(subStrByLength(aa, 50));
//		System.out.println(subStringByByte(aa, 50));
//		System.out.println(subStringByByte("111111", 50));
//		System.out.println(subStringByByte(aa, 50).getBytes("GBK").length);
//		System.out.println(bb.getBytes("GBK").length);
//		System.out.println("·".getBytes("GBK").length);
//		System.out.println("·".getBytes(unicode).length);
//		System.out.println("·".getBytes("utf-8").length);
//		System.out.println("a".getBytes("GBK").length);
//		System.out.println("a".getBytes("utf-8").length);
//		System.out.println("那".getBytes("GBK").length);
//		System.out.println("。".getBytes("GBK").length);
//		System.out.println(subStringByByte("回复大家都", 9));
//		System.out.println(subStringByByte("回复大家都", 9).getBytes("GBK").length);
//		System.out.println(cutString("111111", 50));
//		System.out.println(cutString("111111", 50).getBytes("GBK").length);
//		
//
//		System.out.println("！".getBytes("GBK").length);
//		System.out.println(cutString("111111", 50).getBytes("GBK").length);
//		
//		System.out.println("马里奥巴德".getBytes(unicode).length);
//		System.out.println("马里奥巴德".getBytes("GBK").length);
		String cc = "好的aA";
		System.out.println(cutString(cc,5));
	}
	public static String cutString(String s, int length)
			throws UnsupportedEncodingException {
		if (s != null) {
			if (!"".equals(s)) {
				byte[] bytes = s.getBytes(unicode);
				int n = 0; // 表示当前的字节数
				int i = 2; // 要截取的字节数，从第3个字节开始
				// int i = 0; // 要截取的字节数，从第3个字节开始
				for (; i < bytes.length && n < length; i++) { // 奇数位置，如3、5、7等，为UCS2编码中两个字节的第二个字节
					System.out.println(bytes[i]);
					if (i % 2 == 1) {
						n++; // 在UCS2第二个字节时n加1
					} else { // 当UCS2编码的第一个字节不等于0时，该UCS2字符为汉字，一个汉字算两个字节
						if (bytes[i] != 0) {
							n++;
						}
					}
				}
				// 如果i为奇数时，处理成偶数
				if (i % 2 == 1) { // 该UCS2字符是汉字时，去掉这个截一半的汉字
					if (bytes[i - 1] != 0) {
						i = i - 1;
					} // 该UCS2字符是字母或数字，则保留该字符
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
		/* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
		for (int i = 0; i < value.length(); i++) {
			/* 获取一个字符 */
			String temp = value.substring(i, i + 1);
			/* 判断是否为中文字符 */
			if (temp.matches(chinese)) {
				/* 中文字符按照2个字节计算 */
				valueLength += 2;
			} else {
				/* 其他字符长度为1 */
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
		 * 字符串截取
		 * @param str 原始字符串
		 * @param subcount 截取的长度
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
