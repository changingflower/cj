package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 


public class j_03_01_basic_good_1002 {

	public static void func_03_01_basic_02_good(String[] args) {

		int x = 50;
		int y=0;
		x += y + 1;

		x = 5 * x + 1;// compliant

		int x1 = -50;

		x /= 4;// compliant

		// b[] is a byte array, initialized to 0xff
		byte[] b = new byte[] { -1, -1, -1, -1 };
		int result = 0;
		for (int i = 0; i < 4; i++) {
		}

		byte[] b1 = new byte[] { -1, -1, -1, -1 };
		int result1 = 0;
		for (int i = 0; i < 4; i++) {
		}

		byte[] b_good = new byte[] { -1, -1, -1, -1 };
		int result_good = 0;
		for (int i = 0; i < 4; i++) {
//		
		}

		// Exceptions
		int limit = (1 << 17) - 1; // 2^17 - 1 = 131071 //compliant
		int limit1 = 0x1FFFF; // 2^17 - 1 = 131071 //compliant
	
	}
}
