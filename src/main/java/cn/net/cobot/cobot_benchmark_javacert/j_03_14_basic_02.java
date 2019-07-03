package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_14_basic_02 {
	
	public static void func_03_14_basic_02_bad(String[] args) {
		byte b = 1; /* Initialize */
		int result = b >>> 2;//not compliant
	}
}
