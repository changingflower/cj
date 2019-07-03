package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
public class j_03_01_basic_01 {

	public static void func_03_01_basic_01_bad(String[] args) {

		int x = 50;
		x += (x << 2) + 1;// not compliant

		// b[] is a byte array, initialized to 0xff
		byte[] b = new byte[] { -1, -1, -1, -1 };
		int result = 0;
		for (int i = 0; i < 4; i++) {
			result = ((result << 8) + b[i]);// not compliant
		}

		byte[] b1 = new byte[] { -1, -1, -1, -1 };
		int result1 = 0;
		for (int i = 0; i < 4; i++) {
			result1 = ((result1 << 8) + (b1[i] & 0xff));// not compliant
		}		
	}
}
