package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_12_basic_good_1001 {

	public static void workWith_good1(int i) {
		// Check whether i is within byte range
		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			throw new ArithmeticException("Value is out of range");
		}

		byte b = (byte) i;// compliant
		// Work with b
	}

	public static void workWith_good2(int i) {
		byte b = (byte) (i % 0x100); // 2^8;//compliant
		// Work with b
	}

}
