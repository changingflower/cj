package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
final class j_12_01_basic_02{
  public static j_12_01_basic_02 published;  
  int num;
 
  j_12_01_basic_02(int number) {
    // Initialization
    this.num = number;
    // ...
    published = this;    // not compliant 不是volatile
  }
}

class MyRunnable42 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread42 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}