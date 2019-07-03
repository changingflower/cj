package cn.net.cobot.cobot_benchmark_javacert;
import java.net.MalformedURLException;
import java.net.URL;

//check type:Java

public class j_06_08_basic_good_1003 {
  public static void main(String[] args) throws MalformedURLException {
    final URL allowed = new URL("http://mailwebsite.com");
    if (!allowed.toString().equals(new URL(args[0]).toString())) {
      throw new SecurityException("Access Denied");
    }
    // Else proceed
  }
}