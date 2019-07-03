package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.util.HashSet;

public class j_02_04_basic_01 {

	public static void func_02_04_basic_01_bad(String[] args) {
		HashSet<Short> s_bad = new HashSet<Short>();
		for (int i = 0; i < 10; i++) {
			s_bad.add((short) i); // Cast required so that the code compiles
			s_bad.remove(i);    //not compliant  // Tries to remove an Integer 
		}
		System.out.println(s_bad.size());
	}

}
