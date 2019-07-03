package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_14_basic_03 {

	public static void main(String[] args) {
		func_03_14_basic_03_bad(1);
	}

	public static int func_03_14_basic_03_bad(int exp) {
		// Compute 2^exp
		int temp = 1 << exp;      //not compliant
		// Do other processing
		return temp;
	}
}
