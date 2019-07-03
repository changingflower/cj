package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//check type:java

final class j_11_03_basic_01 {
  private final ExecutorService pool = Executors.newFixedThreadPool(10);
 
  public void doSomething() {
    pool.execute(new Task());  // not compliant
  }
}
 
final class Task implements Runnable {
  @Override public void run() {
    // ...
    throw new NullPointerException();
    // ...
  }
}