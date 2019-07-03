package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.util.ArrayList;

public class j_02_07_basic_good_1003 {

	public static void func_02_03_basic_1003_good() {
		// Create an array list of integers
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list1.add(i + 1000);
		}

		// Create another array list of integers, where each element
		// has the same value as the first one
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list2.add(i + 1000);
		}

		// Count matching values
		int counter = 0;
		for (int i = 0; i < 10; i++) {
			if (list1.get(i).equals(list2.get(i))) { // Uses 'equals()'
				counter++;
			}
		}

		// Print the counter: 10 in this example
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		func_02_03_basic_1003_good();
	}
}
