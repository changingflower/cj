package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.io.IOException;
import java.util.Arrays;

public class j_02_02_basic_good_1001 {

	public static void main(String[] args) throws IOException {		
		int[] arr1 = new int[20]; // Initialized to 0
		int[] arr2 = new int[20]; // Initialized to 0
		System.out.println(Arrays.equals(arr1, arr2)); // Prints true, compliant
	}
}
