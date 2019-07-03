package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_14_basic_04 {

	public static void func_03_14_basic_04_bad(String[] args) {
		int i = 0;
		while ((-1 << i) != 0) {   //not compliant
			i++;
		}
	}

}
