package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_14_basic_good_1002{

	public static void func_03_14_basic_02_good(String[] args) {
		byte b = 1;/* Initialize */
		int result = ((int) b & 0xFF) >>> 2;//compliant
	}
}
