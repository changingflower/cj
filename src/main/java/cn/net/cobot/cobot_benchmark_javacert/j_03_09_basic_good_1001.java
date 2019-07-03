package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_09_basic_good_1001 {

	public static void func_03_09_basic_01_good(String[] args) {

		for (int count = 1; count <= 10; count += 1) {// compliant
			float x = count / 10.0f;
			System.out.println(x);
		}
	}
}
