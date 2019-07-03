package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.util.HashSet;

public class j_02_04_basic_good_1001 {

	public static void func_02_04_basic_1001_good(String[] args) {

		HashSet<Short> s_good = new HashSet<Short>();
		for (int i = 0; i < 10; i++) {
			s_good.add((short) i);
			// Remove a Short
			if (s_good.remove((short) i) == false) {// compliant
				System.err.println("Error removing " + i);
			}
		}
		System.out.println(s_good.size());
		
	}

}
