package cn.net.cobot.cobot_benchmark_javacert;
import java.io.FileNotFoundException;

//check type:Java
class j_07_00_basic_good_1002 implements Runnable {
  public void run() {

	   boolean  validFlag = false;
        do {
          try {
            // If requested file does not exist, throws FileNotFoundException
            // If requested file exists, sets validFlag to true
            validFlag = true;
          } catch (Exception e) {
            System.out.println("please input another name");
          }
        } while (validFlag != true);
        // Use the file
  }
}
