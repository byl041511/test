package aaa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		String aa = "20200622000000";
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = df.parse(aa);
			System.out.println(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
	}

}
