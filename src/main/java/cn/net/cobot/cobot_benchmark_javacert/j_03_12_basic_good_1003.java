package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_12_basic_good_1003 {

	public static void func_03_12_basic_03_good(String[] args) {
		// double to float Conversion
		double i = Double.MIN_VALUE;
		double j = Double.MAX_VALUE;

		if ((i < Float.MIN_VALUE) || (i > Float.MAX_VALUE) || (j < Float.MIN_VALUE) || (j > Float.MAX_VALUE)) {
			throw new ArithmeticException("Value is out of range");
		}

		float b3 = (float) i;// compliant
		float c3 = (float) j;// compliant
		// Other operations
	}
}
