package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.util.Random;
import java.util.Vector;
public final class j_10_05_basic_01 implements Runnable {
  private final Vector<Integer> vector = new Vector<Integer>();

  public Vector<Integer> getVector() {
    return vector;
  }

  @Override public synchronized void run() {
    Random number = new Random(123L);
    int i = vector.capacity();
    while (i > 0) {
      vector.add(number.nextInt(100));
      i--;
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new j_10_05_basic_01());
    thread.start();
    Thread.sleep(5000);
    thread.stop();                 //not compliant
  }
}
