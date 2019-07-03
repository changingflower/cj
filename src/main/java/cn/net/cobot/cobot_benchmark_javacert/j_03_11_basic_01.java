package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.math.BigDecimal;

public class j_03_11_basic_01 {
	public static void func_03_11_basic_01_bad(String[] args) {
		int i = 1;
		String s = Double.valueOf(i / 1000.0).toString();
		if (s.equals("0.001")) {           //not compliant
		  // ...
		}
		
		int i1 = 1;
		String s1 = Double.valueOf(i1 / 1000.0).toString();
		s1 = s1.replaceFirst("[.0]*$", "");
		if (s1.equals("0.001")) {                  //not compliant
		  // ...
		}
		
		int i2 = 1;
		String s2 = Double.valueOf(i2 / 10000.0).toString();
		s2 = s2.replaceFirst("[.0]*$", "");
		if (s2.equals("0.0001")) {             //not compliant
		  // ...
		}
	}
}
