package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public final class j_08_01_basic_good_01 {
  private final int n;
 
  public j_08_01_basic_good_01(int n) {
    this.n = n;
  }
  // ...
}

final class j_08_01_basic_good_01_1 {
  private j_08_01_basic_good_01 helper;
 
  public synchronized j_08_01_basic_good_01 getHelper() {
    return helper;
  }
 
  public synchronized void setHelper(int num) {
    helper = new j_08_01_basic_good_01(num);
  }
}
class MyRunnable2 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread2 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}