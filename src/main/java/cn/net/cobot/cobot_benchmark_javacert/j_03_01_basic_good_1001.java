package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 


public class j_03_01_basic_good_1001 {

	public static void func_03_01_basic_01_good(String[] args) {

		// Exceptions
		int limit = (1 << 17) - 1; // 2^17 - 1 = 131071 //compliant
		int limit1 = 0x1FFFF; // 2^17 - 1 = 131071 //compliant
		// int value = 0;/* Interesting value */
		// Byte[] bytes = new Byte[4];
		// for (int i = 0; i < bytes.length; i++) {
		// bytes[i] = value >> (i * 8) & 0xFF;
		// }
		/* bytes[] now has same bit representation as value */
	}
}
