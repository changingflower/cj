package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
/* This class is not thread-safe */
public final class j_09_05_basic_01 {
  private static int counter;
 
  public void incrementCounter() {
    counter++;  //not compliant
  }
}