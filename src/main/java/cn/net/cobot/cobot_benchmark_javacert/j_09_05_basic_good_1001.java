package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
public final class j_09_05_basic_good_1001 {
/* This class is thread-safe */

  private static int counter;
  private static final Object lock = new Object();
 
  public void incrementCounter() {
    synchronized (lock) {
      counter++;
    }
  }

}
