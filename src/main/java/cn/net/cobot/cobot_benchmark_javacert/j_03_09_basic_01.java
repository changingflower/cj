package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_09_basic_01 {

	public static void func_03_09_basic_01_bad(String[] args) {
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {// not compliant
			System.out.println(x);
		}

	}
}
