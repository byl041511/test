package aaa;

import java.math.BigDecimal;


public class TestNull {
	public static void main(String[] args) {
		BigDecimal aa = new BigDecimal("23");
		String cc = null != (aa + "") ? (aa + "") : "";
        System.out.println(cc);
	}

}
