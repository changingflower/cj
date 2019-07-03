package cn.net.cobot.cobot_benchmark_javacert;
//check type:java


public class j_09_01_basic_good_1003 {

  private final String lock = new String("LOCK");

  public void func_09_01_basic_03_good() {
    synchronized (lock) {
      // ...
    }
  }
}
