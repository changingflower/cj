package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.util.Random;
import java.util.Vector;
public final class j_10_05_basic_good_1001 implements Runnable {
  private final Vector<Integer> vector = new Vector<Integer>(1000);
  private volatile boolean done = false;
 
  public Vector<Integer> getVector() {
    return vector;
  }
 
  public void shutdown() {
    done = true;
  }
 
  @Override public synchronized void run() {
    Random number = new Random(123L);
    int i = vector.capacity();
    while (!done && i > 0) {
      vector.add(number.nextInt(100));
      i--;
    }
  }
 
  public static void main(String[] args) throws InterruptedException {
	j_10_05_basic_good_1001 container = new j_10_05_basic_good_1001();
    Thread thread = new Thread(container);
    thread.start();
    Thread.sleep(5000);
    container.shutdown();
  }
}