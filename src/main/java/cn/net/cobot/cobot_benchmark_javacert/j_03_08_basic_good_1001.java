package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_03_08_basic_good_1001 {

	double currentBalance; // User's cash balance	
	 
	void doDeposit_good(String userInput){
	  double val = 0;
	  try {
	    val = Double.valueOf(userInput);
	  } catch (NumberFormatException e) {
	    // Handle input format error
	  }
	 
	  if (Double.isInfinite(val)){
	    // Handle infinity error
	  }
	 
	  if (Double.isNaN(val)) {
	    // Handle NaN error
	  }
	 
	  if (val >= Double.MAX_VALUE - currentBalance) {
	    // Handle range error
	  }
	  currentBalance += val;
	}
	
	//Exceptions
}
