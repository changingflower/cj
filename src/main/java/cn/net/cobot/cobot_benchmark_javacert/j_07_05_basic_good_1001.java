package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//check type:java 
public class j_07_05_basic_good_1001 {
  public static void doOperation(String some_file) {
    // ... Code to check or set character encoding ...
    try {
      BufferedReader reader =
          new BufferedReader(new FileReader(some_file));
      try {
        // Do operations
      } finally {
        try {
          reader.close();
        } catch (IOException ie) {
          // Forward to handler
        }
        // ... Other cleanup code ...
      }
    } catch (IOException x) {
      // Forward to handler
    }
  }
}