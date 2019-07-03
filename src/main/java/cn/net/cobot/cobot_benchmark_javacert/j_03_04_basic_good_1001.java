package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.math.BigDecimal;

public class j_03_04_basic_good_1001 {

	public static void func_03_04_basic_01_good(String[] args) {

		int dollar1 = 100;
		int dime1 = 10;
		int number1 = 7;
		System.out.println(
		  "A dollar less " + number1 + " dimes is $0." + (dollar1 - number1 * dime1)
		);//compliant
		
		BigDecimal dollar2 = new BigDecimal("1.0");
		BigDecimal dime2 = new BigDecimal("0.1");
		int number2 = 7;
		System.out.println ("A dollar less " + number2 + " dimes is $" +
		    (dollar2.subtract(new BigDecimal(number2).multiply(dime2) )) );
		//compliant
	}
}
