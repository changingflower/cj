package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_14_basic_good_1003 {

	public static void main(String[] args) {
		func_03_14_basic_03_good(1);
	}

	public static int func_03_14_basic_03_good(int exp) throws ArithmeticException {
		if ((exp < 0) || (exp >= 32)) {
			throw new ArithmeticException("Exponent out of range");
		}
		// Safely compute 2^exp
		int temp = 1 << exp;
		// Do other processing
		return temp;
	}
}
