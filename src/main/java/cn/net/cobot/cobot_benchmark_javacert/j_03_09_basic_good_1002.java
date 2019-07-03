package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_09_basic_good_1002 {

	public static void func_03_09_basic_02_good(String[] args) {

		for (int count = 1; count <= 10; count += 1) {//compliant
			double x = 100000000.0 + count;
			/* ... */
		}
	}
}
