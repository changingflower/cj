package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
public final class j_10_02_basic_01 implements Runnable {
  private static final Object lock = new Object();
  private static int time = 0;
  private final int step; // Do Perform operations when field time
                          // reaches this value

  public j_10_02_basic_01(int step) {
    this.step = step;
  }

  @Override public void run() {
    try {
      synchronized (lock) {
        while (time != step) {
          lock.wait();
        }

        // Perform operations

        time++;
        lock.notify();          //not compliant
      }
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt(); // Reset interrupted status
    }
  }

  public static void main(String[] args) {
    for (int i = 4; i >= 0; i--) {
      new Thread(new j_10_02_basic_01(i)).start();
    }
  }
}
