package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//check type:java 
class j_07_04_basic_good_1002 {
  private static boolean doLogic() {
    try {
      throw new IllegalStateException();
    } finally {
      int c;
      try {
    	  BufferedReader input = new BufferedReader(new FileReader(""));
        while ((c = input.read()) != -1) {
          if (c > 128) {
            break;
          }
        }
      } catch (IOException x) {
        // Forward to handler
      }
      System.out.println("logic done");
    }
    // Any return statements must go here; applicable only when exception is thrown conditionally
  }
}