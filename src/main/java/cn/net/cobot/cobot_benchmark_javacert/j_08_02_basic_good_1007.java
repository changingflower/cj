package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

final class j_08_02_basic_good_1007 {
 
  public int getSum() {
    return 0X10FFFF + 1;
  }

}

class MyRunnable16 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread16 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}