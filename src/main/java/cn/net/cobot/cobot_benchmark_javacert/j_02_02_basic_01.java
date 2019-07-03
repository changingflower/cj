package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.io.IOException;

public class j_02_02_basic_01 {
	
	public void func_02_02_basic_01_bad()
	{
		int[] arr1 = new int[20]; // Initialized to 0
		int[] arr2 = new int[20]; // Initialized to 0
		System.out.println(arr1.equals(arr2));			 //not compliant
		System.out.println(arr1 == arr2); 			
	}
	public static void main(String[] args) throws IOException {
	
	}
}
