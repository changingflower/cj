package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
public class j_03_14_basic_01 {
	
	static int func_03_14_basic_01_bad(long value) {
		int bits = 0;
		while (value != 0) {
			bits += value & 1L;
			value >>= 1; //not compliant // Signed right shift, by one
		}//漏报
		return bits;
	}
}
