package cn.net.cobot.cobot_benchmark_javacert;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

//check type:Java

public class j_06_08_basic_good_1005 {
  public static void main(String[] args)
                     throws MalformedURLException, URISyntaxException {
    final URI allowed = new URI("http://mailwebsite.com");
    if (!allowed.equals(new URI(args[0]))) {
      throw new SecurityException("Access Denied");
    }
    // Else proceed
  }
}