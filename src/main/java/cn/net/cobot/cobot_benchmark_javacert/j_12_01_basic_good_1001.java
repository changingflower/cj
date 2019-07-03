package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
final class j_12_01_basic_good_1001 {
  static volatile j_12_01_basic_good_1001 published;
  int num;
 
  j_12_01_basic_good_1001(int number) {
    // Initialization
    this.num = number;
    // ...
    published = this;
  }
}

class MyRunnable46 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread46 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}