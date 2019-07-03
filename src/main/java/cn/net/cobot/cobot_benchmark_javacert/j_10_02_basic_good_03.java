package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//check type:java
public final class j_10_02_basic_good_03 implements Runnable {
  private static final Lock lock = new ReentrantLock();
  private static final Condition condition = lock.newCondition();
  private static int time = 0;
  private  int step=1; // Perform operations when field time
                          // reaches this value
  public j_10_02_basic_good_03(int step) {
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
      condition.signalAll();
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt(); // Reset interrupted status
    } finally {
      lock.unlock();
    }
  }
}