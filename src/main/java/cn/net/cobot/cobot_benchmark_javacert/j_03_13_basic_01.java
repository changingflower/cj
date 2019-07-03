package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_13_basic_01 {

	public static int subFloatFromInt_bad(int op1, float op2) {
		return op1 - (int) op2;
	}

	public static void func_03_13_basic_01_bad(String[] args) {

		int result = subFloatFromInt_bad(1234567890, 1234567890);   // not compliant
		// This prints -46, not 0, as may be expected
		System.out.println(result);

	}

}
