package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_07_basic_good_1001 {

	public static void func_03_07_basic_01_good(String[] args) {
	    double x = 0.0;
	    double result = Math.cos(1/x); // Returns NaN if input is infinity

	    if (Double.isNaN(result)) {//compliant
	      System.out.println("result is NaN");
	    }
	  }
}
