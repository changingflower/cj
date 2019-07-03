package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.util.Comparator;

public class j_02_03_basic_good_1001 {
	
	static Comparator<Integer> cmp_good = new Comparator<Integer>() {// compliant
		public int compare(Integer i, Integer j) {
			return i < j ? -1 : (i > j ? 1 : 0);
		}
	};
}
