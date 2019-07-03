package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_12_basic_good_1002 {

	public static void func_03_12_basic_02_good(String[] args) {
		// Floating-Point to Integer Conversion
		float i = Float.MIN_VALUE;
		float j = Float.MAX_VALUE;

		if ((i < Short.MIN_VALUE) || (i > Short.MAX_VALUE) || (j < Short.MIN_VALUE) || (j > Short.MAX_VALUE)) {
			throw new ArithmeticException("Value is out of range");
		}

		short b1 = (short) i;// compliant
		short c1 = (short) j;// compliant
		// Other operations
	}
}
