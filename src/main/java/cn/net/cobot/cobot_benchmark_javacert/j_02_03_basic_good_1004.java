package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_02_03_basic_good_1004 {

	public void func_02_03_basic_1004_good() {// compliant
		Boolean b1 = true;
		Boolean b2 = true;

		if (b1 == b2) { // Always equal
			System.out.println("Always printed");
		}

		b1 = Boolean.TRUE;
		if (b1 == b2) { // Always equal
			System.out.println("Always printed");
		}
	}
}
