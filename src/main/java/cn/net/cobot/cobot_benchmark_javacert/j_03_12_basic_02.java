package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_12_basic_02 {

	public static void func_03_12_basic_0221_bad(String[] args) {
		// Floating-Point to Integer Conversion
		float i = Float.MIN_VALUE;
		float j = Float.MAX_VALUE;
		
		short b = (short) i;// not compliant
		short c = (short) j;// not compliant

	}
}
