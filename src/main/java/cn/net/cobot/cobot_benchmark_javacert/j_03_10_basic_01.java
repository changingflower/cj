package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.math.BigDecimal;

public class j_03_10_basic_01 {
	public static void func_03_10_basic_01_bad(String[] args) {
		// Prints 0.1000000000000000055511151231257827021181583404541015625
		// when run in FP-strict mode
		System.out.println(new BigDecimal(0.1));//not compliant
	}
}
