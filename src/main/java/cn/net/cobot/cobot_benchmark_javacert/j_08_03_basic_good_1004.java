package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.*;
final class j_08_03_basic_good_1004 {
  private final ConcurrentMap<String, AtomicInteger> map =
      new ConcurrentHashMap<String, AtomicInteger>();
  private final Object lock = new Object();
 
  public void increment(String key) {
    AtomicInteger value = new AtomicInteger();
    AtomicInteger old = map.putIfAbsent(key, value);
 
    if (old != null) {
      value = old;
    }
 
    synchronized (lock) {
      if (value.get() == Integer.MAX_VALUE) {
        throw new ArithmeticException("Out of range");
      }
      value.incrementAndGet(); // Increment the value atomically
    }
  }
 
  public Integer getCount(String key) {
    AtomicInteger value = map.get(key);
    return (value == null) ? null : value.get();
  }
 
  // Other accessors ...
}

class MyRunnable24 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread24 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}