package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.math.BigInteger;
import java.util.Base64;

public class j_04_03_basic_good_1001{
  public static void func_04_03_basic_01_good1(String[] args) {
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString(); // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray);
    x = new BigInteger(ns);
    System.out.println(x);
  }

  public static void func_04_03_basic_01_good2() {
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = Base64.getEncoder().encodeToString(byteArray);
    byteArray = Base64.getDecoder().decode(s);
    x = new BigInteger(byteArray);
    System.out.println(x);
  }
}
