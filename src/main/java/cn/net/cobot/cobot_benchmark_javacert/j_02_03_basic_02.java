package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_02_03_basic_02 {

	public static void func_02_03_basic_02_bad(String[] args) {
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println(i1 == i2);//not compliant
		System.out.println(i1 != i2);//not compliant
		System.out.println(i3 == i4);//not compliant
		System.out.println(i3 != i4);//not compliant
		
	}
}
