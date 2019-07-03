package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.IOException;

class j_13_09_basic_good_1001 {
	  public static void main(String[] args)
	                          throws NumberFormatException, IOException {
		    // Perform range checking
		    int value = Integer.valueOf(args[0]);
		    if (value < 0 || value > 255) {
		      throw new ArithmeticException("Value is out of range");
		    }

		    System.out.write(value);
		    System.out.flush();
	  }
}
