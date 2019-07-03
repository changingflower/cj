package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
class j_12_03_basic_good_1001 {
  private Helper helper;
 
  public synchronized Helper getHelper() {
    return helper;
  }
 
  public synchronized void initialize() {
    helper = new Helper(42);
  }
}

class MyRunnable51 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread51 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}