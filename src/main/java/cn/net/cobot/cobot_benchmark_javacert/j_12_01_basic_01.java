package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
final class j_12_01_basic_01{
  public static volatile j_12_01_basic_01 published;
  int num;
 
  j_12_01_basic_01(int number) {
    published = this;        // not compliant  未初始化
    // Initialization
    this.num = number;
    // ...
  }
}

class MyRunnable41 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread41 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}