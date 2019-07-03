package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.io.IOException;
import java.io.InputStream;

public class j_02_05_basic_good_1001 {
	public static void func_02_05_basic_01_good(String[] args) {
		int number = 17;
		int threshold = 10;int authnum=11;
		number = ((31 * (number + 1)) * authnum) + (authnum > threshold ? 0 : -2);// compliant
		// ...
		if (number == 0) {
			System.out.println("Access granted");
		} else {
			System.out.println("Denied access"); // number = -2
		}

	}
}
