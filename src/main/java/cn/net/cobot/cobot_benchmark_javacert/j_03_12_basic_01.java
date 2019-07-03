package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_12_basic_01 {

	// Integer Narrowing
	public static void func_03_12_basic_01_bad(int i) {
		byte b = (byte) i; //not compliant     // b has value -128
	}
}
