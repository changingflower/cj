package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.math.BigDecimal;

public class j_03_11_basic_good_1001 {
	public static void func_03_11_basic_01_good(String[] args) {
		int i3 = 1;
		BigDecimal d = new BigDecimal(Double.valueOf(i3 / 1000.0).toString());
		if (d.compareTo(new BigDecimal("0.001")) == 0) {//compliant
		  // ...
		}
	}
}
