package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.math.*;
import java.util.concurrent.atomic.AtomicReference;
final class j_08_03_basic_good_1001 {
  // ...
  private  AtomicReference<BigInteger> first;
  private  AtomicReference<BigInteger> second;
 
  public void Adder(BigInteger f, BigInteger s) {
    first  = new AtomicReference<BigInteger>(f);
    second = new AtomicReference<BigInteger>(s);
  }
 
 
 
  public synchronized void update(BigInteger f, BigInteger s){
    first.set(f);
    second.set(s);
  }
 
  public synchronized BigInteger add() {
    return first.get().add(second.get());
  }
}

class MyRunnable21 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread21 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}