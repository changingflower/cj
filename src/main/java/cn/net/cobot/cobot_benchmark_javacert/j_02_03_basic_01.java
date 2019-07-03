package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.util.Comparator;

public class j_02_03_basic_01 {
	  
	static Comparator<Integer> cmp_bad = new Comparator<Integer>() {
		public int compare(Integer i, Integer j) {
			return i < j ? -1 : (i == j ? 0 : 1);                 // not compliant
		}
	};
}
