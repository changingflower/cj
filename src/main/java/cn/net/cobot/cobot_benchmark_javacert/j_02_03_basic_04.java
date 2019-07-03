package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_02_03_basic_04 {

	public void func_02_03_basic_04_bad() {
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean("true");

		if (b1 == b2) { 		// not compliant
			System.out.println("Never printed");
		}
	}
}
