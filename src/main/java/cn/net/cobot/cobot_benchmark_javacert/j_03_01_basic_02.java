package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
public class j_03_01_basic_02 {
	public static void func_03_01_basic_02_bad(String[] args) {		
		int x = 50;
		int y = x << 2;
		x += y + 1;	  // not compliant 漏报

	}
}
