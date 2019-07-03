package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.math.BigInteger;

public class j_04_03_basic_01 {
  public static void func_04_03_basic_01_bad(String[] args) {
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);      //not compliant
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
    System.out.println(x);
  }
}
