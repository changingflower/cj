package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
// Immutable Helper
public final class j_08_01_basic_01 {
  private final int n;
 
  public j_08_01_basic_01(int n) {
    this.n = n;
  }
  // ...
}

final class j_08_01_basic_01_1 {
  private j_08_01_basic_01 helper;
 
  public j_08_01_basic_01 getHelper() {
    return helper;       //not compliant
  }
 
  public void setHelper(int num) {
    helper = new j_08_01_basic_01(num);
  }
}

class MyRunnable1 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread1 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}