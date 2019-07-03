package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_12_basic_03 {

	public static void func_03_12_basic_03_bad(String[] args) {		
		// double to float Conversion
		double i = Double.MIN_VALUE;
		double j = Double.MAX_VALUE;
		
		float b2 = (float) i;// not compliant
		float c2 = (float) j;// not compliant
	}
}
