package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Scanner;
import java.util.logging.Logger;
public class j_00_03_basic_01 {
  static Logger logger = Logger.getLogger("lavasoft"); 
  static boolean loginSuccessful = false;
  public static void main(String[] args) {
    String username = args[0];
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);//not compliant
    } else {
      logger.severe("User login failed for: " + username);//not compliant
    }
  }
  
  public static void test() {
    Scanner scanner = new Scanner(System.in);
    String password = scanner.next();
    logger.severe("pwd is: "+password);
    scanner.close();
  }



    
}