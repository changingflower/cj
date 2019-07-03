package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.atomic.AtomicInteger;

//check type:Java

final class j_08_02_basic_05 {
  private final AtomicInteger a = new AtomicInteger();
  private final AtomicInteger b = new AtomicInteger();
 
  public int getSum() {
    return a.get() + b.get();	//not compliant
  }
 
  public void setValues(int a, int b) {
    this.a.set(a);
    this.b.set(b);
  }
}

class MyRunnable9 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread9 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}