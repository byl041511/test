package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class aaa {
	public static void main(String[] args) {
//		List<String> strList = new ArrayList<>();
//		strList.add("list-a");
//		strList.add("list-b");
//		String[] strArray = strList.toArray(new String[strList.size()]);
//		for (String string : strArray) {
//			System.out.println(string);
//		}
//		
//	    Map<String, Object> map = new HashMap<String, Object>();
//
//	    map.put("destMobileNumber", "");
//	    map.put("extensionCode", "");
//	    map.put("msgContent", "���ص���"+""+",�걨���ݣ�����/������");
//	    map.put("priority", "5");
//	    map.put("encrypt", "true");
//	    map.put("doNotDisturb", "false");
//	    map.put("intervalTimeSecond", "0");
//	    map.put("smsPlat", "");
//	    map.put("smsSign", "");
//	    System.out.println(map.toString());

//	    String aa= "�����ѽ�ž�";
//	    System.err.println(aa.indexOf("�ѽ�"));
//	    
//	    System.out.println(String.format("%018d", 11));
//	    
//	    String str="18qqqqqqqqqqqqqqq23";
//	    String name = String.format("%-12s",str);
//	    System.out.println(name+"���");
//	    
//	    
//	    System.out.println(addZeroForNum(str,18));
//		String aa = "0003 05";
//		System.out.println(aa.substring(2,4));
		StringBuffer partOfMsg = new StringBuffer();
		if ("".equals(partOfMsg.toString())) {
			System.out.println("1111");
		}
		System.out.println("1111");
	}
	
	public static String addZeroForNum(String str, int strLength) {
	    int strLen = str.length();
	    StringBuffer sb = null;
	     while (strLen < strLength) {
	          sb = new StringBuffer();
	         sb.append("0").append(str);// ��0
	       // sb.append(str).append("0");//�Ҳ�0
	          str = sb.toString();
	          strLen = str.length();
	     }
	    return str;
	}

}
