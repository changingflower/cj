package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_09_basic_02 {

	public static void func_03_09_basic_02_bad(String[] args) {

		for (float x = 100000001.0f; x <= 100000010.0f; x += 1.0f) {// not compliant
			/* ... */
		}
	}
}
