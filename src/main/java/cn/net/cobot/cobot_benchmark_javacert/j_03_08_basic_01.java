package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_08_basic_01 {

	double currentBalance; // User's cash balance
	 
	void func_03_08_basic_01_bad(String userInput) {
	  double val = 0;
	  try {
	    val = Double.valueOf(userInput);          //not compliant
	  } catch (NumberFormatException e) {
	    // Handle input format error
	  }
	 
	  if (val >= Double.MAX_VALUE - currentBalance) {
	    // Handle range error
	  }
	 
	  currentBalance += val;
	}	
	
}
