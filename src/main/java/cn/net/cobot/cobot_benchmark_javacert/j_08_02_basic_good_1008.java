package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

final class j_08_02_basic_good_1008 {
  private int a;
 
  public int getSum() {
    return a + 1;
  }
 
  public void setValues(int a, int b) {
    this.a = a;
  }
}

class MyRunnable17 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread17 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}