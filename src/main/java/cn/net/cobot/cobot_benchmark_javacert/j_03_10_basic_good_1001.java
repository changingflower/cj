package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.math.BigDecimal;

public class j_03_10_basic_good_1001 {
	public static void func_03_10_basic_01_good(String[] args) {
		// Prints 0.1
		// when run in FP-strict mode
		System.out.println(new BigDecimal("0.1"));//compliant
	}
}
