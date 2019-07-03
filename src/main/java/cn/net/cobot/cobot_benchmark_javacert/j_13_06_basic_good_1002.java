package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.BufferedInputStream;

class j_13_06_basic_good_1002_1 {
	  private static BufferedInputStream in =
	     new BufferedInputStream(System.in);

	  static BufferedInputStream getBufferedWrapper() {
	    return in;
	  }

	  // ... Other methods
	}


	// Some code that requires user input from System.in
public final class j_13_06_basic_good_1002 {
	  private static BufferedInputStream in;

	  j_13_06_basic_good_1002() {
	    in = j_13_06_basic_good_1002_1.getBufferedWrapper();
	  }

	  // ... Other methods
}
