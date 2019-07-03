package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

final class j_08_02_basic_good_1006 {
  private int a;
  private int b;
 
  public synchronized int getSum() {
    // Check for overflow
    return a + b;
  }
 
  public synchronized void setValues(int a, int b) {
    this.a = a;
    this.b = b;
  }
}

class MyRunnable15 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread15 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}