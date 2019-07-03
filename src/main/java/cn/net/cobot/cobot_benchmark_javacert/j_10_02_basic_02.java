package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//check type:java
public class j_10_02_basic_02 implements Runnable {
  private static final Lock lock = new ReentrantLock();
  private static final Condition condition = lock.newCondition();
  private static int time = 0;
  private final int step; // Perform operations when field time
                          // reaches this value
  public j_10_02_basic_02(int step) {
    this.step = step;
  }

  @Override public void run() {
    lock.lock();
    try {
      while (time != step) {
        condition.await();
      }

      // Perform operations

      time++;
      condition.signal();    //not compliant
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt(); // Reset interrupted status
    } finally {
      lock.unlock();
    }
  }

  public static void main(String[] args) {
    for (int i = 4; i >= 0; i--) {
      new Thread(new j_10_02_basic_02(i)).start();
    }
  }
}
