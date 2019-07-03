package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.math.BigDecimal;

public class j_03_04_basic_01 {

	public static void func_03_04_basic_01_bad(String[] args) {
		double dollar = 1.00;
		double dime = 0.10;
		int number = 7;
		System.out.println(
		  "A dollar less " + number + " dimes is $" + (dollar - number * dime)     //not compliant
		);
	}
}
