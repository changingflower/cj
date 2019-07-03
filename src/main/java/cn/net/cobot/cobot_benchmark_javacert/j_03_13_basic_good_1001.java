package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_13_basic_good_1001 {

	public static int subFloatFromInt_good1(int op1, float op2) throws ArithmeticException {

		// The significand can store at most 23 bits
		if ((op2 > 0x007fffff) || (op2 < -0x800000)) {
			throw new ArithmeticException("Insufficient precision");// compliant
		}

		return op1 - (int) op2;
	}

	public static int subDoubleFromInt_good2(int op1, double op2) {//compliant
		return op1 - (int) op2;
	}

	public static void func_03_13_basic_01_good(String[] args) {

		int result_good1 = subFloatFromInt_good1(1234567890, 1234567890);
		System.out.println(result_good1);
		
		int result_good2 = subDoubleFromInt_good2(1234567890, 1234567890);
	    // Works as expected
	    System.out.println(result_good2); 
	}

}
