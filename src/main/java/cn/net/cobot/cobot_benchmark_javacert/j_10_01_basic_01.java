package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
final class HandleRequest implements Runnable {
  public void run() {
    // Do something
  }
}

public final class j_10_01_basic_01 implements Runnable {
  private static ThreadGroup tg = new ThreadGroup("Chief");

  @Override public void run() {
    new Thread(tg, new HandleRequest(), "thread1").start();
    new Thread(tg, new HandleRequest(), "thread2").start();
    new Thread(tg, new HandleRequest(), "thread3").start();
  }

  public static void printActiveCount(int point) {
    System.out.println("Active Threads in Thread Group " + tg.getName() +
        " at point(" + point + "):" + " " + tg.activeCount());           //not compliant
  }

  public static void printEnumeratedThreads(Thread[] ta, int len) {
    System.out.println("Enumerating all threads...");
    for (int i = 0; i < len; i++) {
      System.out.println("Thread " + i + " = " + ta[i].getName());           
    }
  }

  public static void main(String[] args) throws InterruptedException {
    // Start thread controller
    Thread thread = new Thread(tg, new j_10_01_basic_01(), "controller");
    thread.start();

    // Gets the active count (insecure)
    Thread[] ta = new Thread[tg.activeCount()];              //not compliant

    printActiveCount(1); // P1
    // Delay to demonstrate TOCTOU condition (race window)
    Thread.sleep(1000);
    // P2: the thread count changes as new threads are initiated
    printActiveCount(2);
    // Incorrectly uses the (now stale) thread count obtained at P1
    int n = tg.enumerate(ta);                                     //not compliant
    // Silently ignores newly initiated threads
    printEnumeratedThreads(ta, n);
                                   // (between P1 and P2)

    // This code destroys the thread group if it does
    // not have any live threads
    for (Thread thr : ta) {
      thr.interrupt();
      while(thr.isAlive());
    }
    tg.destroy();
  }
}
