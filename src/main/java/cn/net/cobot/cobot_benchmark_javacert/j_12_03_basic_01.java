package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
class j_12_03_basic_01 {
  private Helper50 helper;
 
  public Helper50 getHelper() {
    return helper;
  }
 
  public void initialize() {
    helper = new Helper50(42);  //not compliant
  }
}
 
 class Helper50 {
  private int n;
 
  public Helper50(int n) {
    this.n = n;
  }
  // ...
}

class MyRunnable50 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread50 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}