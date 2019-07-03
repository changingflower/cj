package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.util.concurrent.atomic.AtomicBoolean;
 
final class j_08_02_basic_good_1005 {
  private AtomicBoolean flag = new AtomicBoolean(true);
 
  public void toggle() {
    boolean temp;
    do {
      temp = flag.get();
    } while (!flag.compareAndSet(temp, !temp));
  }
 
  public AtomicBoolean getFlag() {
    return flag;
  }
}

class MyRunnable14 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread14 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}