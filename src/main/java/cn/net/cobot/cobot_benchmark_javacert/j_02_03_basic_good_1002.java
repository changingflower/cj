package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_02_03_basic_good_1002 {

	public static void func_02_03_basic_1002_good(String[] args) {
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 1000;
		Integer i4 = 1000;
		
		System.out.println(i1.equals(i2));//compliant
	    System.out.println(!i1.equals(i2));//compliant
	    System.out.println(i3.equals(i4));//compliant
	    System.out.println(!i3.equals(i4));//compliant
	}
}
