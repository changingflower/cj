package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_07_basic_01 {

	public static void func_03_07_basic_01_bad(String[] args) {
	    double x = 0.0;
	    double result = Math.cos(1/x); // Returns NaN if input is infinity
	    if (result == Double.NaN) {             //not compliant -- Comparison is always false!,
	      System.out.println("result is NaN");
	    }
	  }
}
