package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
class j_08_05_basic_good_01 {
  private volatile long i = 0;
 
  void assignValue(long j) {
    i = j;
  }
 
  void printLong() {
    System.out.println("i = " + i);
  }
}

class MyRunnable31 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread31 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}