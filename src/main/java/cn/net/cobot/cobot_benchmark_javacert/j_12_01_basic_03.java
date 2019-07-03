package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
final class j_12_01_basic_03 implements Runnable {
  public j_12_01_basic_03() {
    Thread thread = new Thread(this);  //not compliant
    thread.start();
  }
 
  @Override public void run() {
    // ...
  }
}


class MyRunnable43 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread43 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}