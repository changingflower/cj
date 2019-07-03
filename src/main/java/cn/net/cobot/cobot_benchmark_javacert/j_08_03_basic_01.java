package cn.net.cobot.cobot_benchmark_javacert;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

//check type:Java

final class j_08_03_basic_01 {
  private  AtomicReference<BigInteger> first=null;
  private  AtomicReference<BigInteger> second=null;
 
  public void Adder(BigInteger f, BigInteger s) {
    first  = new AtomicReference<BigInteger>(f);
    second = new AtomicReference<BigInteger>(s);
  }
 
  public void update(BigInteger f, BigInteger s) { //not compliant
    first.set(f);
    second.set(s);
  }
 
  public BigInteger add() { //not compliant
    return first.get().add(second.get());
  }
}

class MyRunnable18 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread18 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}