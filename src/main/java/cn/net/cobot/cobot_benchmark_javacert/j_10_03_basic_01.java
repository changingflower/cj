package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
public class j_10_03_basic_01 {
  public void main(String[] args) throws InterruptedException {
    int magic = 42;
    Object object = new Object();
    synchronized (object) {
      if (magic < 50) {
        object.wait();               //not compliant
      }
      // Proceed when condition holds
    }
  }
}
