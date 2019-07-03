package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.io.IOException;
import java.io.InputStream;

public class j_02_05_basic_01 {
	public static void func_02_05_basic_01_bad(String[] args) {
		int number = 17;
		int threshold = 10;
		number = (number > threshold ? 0 : -2) + ((31 * ++number) * (number = get()));// not compliant
		// ...
		if (number == 0) {
			System.out.println("Access granted");
		} else {
			System.out.println("Denied access"); // number = -2
		}

	}

	public static int get() {
		int number = 0;
		// Assign number to nonzero value if authorized, else 0
		return number;
	}

}
