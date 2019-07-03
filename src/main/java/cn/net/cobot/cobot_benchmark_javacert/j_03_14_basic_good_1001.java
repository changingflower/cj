package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_14_basic_good_1001 {

	static int func_03_14_basic_01_good(long value) {
		int bits = 0;
		while (value != 0) {
			bits += value & 1L;
			value >>>= 1;//compliant
		}
		return bits;
	}
}
