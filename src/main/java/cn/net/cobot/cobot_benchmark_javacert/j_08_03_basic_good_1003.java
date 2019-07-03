package cn.net.cobot.cobot_benchmark_javacert;
import java.util.HashMap;
import java.util.Map;

//check type:Java

final class j_08_03_basic_good_1003 {
  private final Map<String, Integer> map =
      new HashMap<String, Integer>();
  private final Object lock = new Object();
 
  public void increment(String key) {
    synchronized (lock) {
      Integer old = map.get(key);
      int oldValue = (old == null) ? 0 : old.intValue();
      if (oldValue == Integer.MAX_VALUE) {
        throw new ArithmeticException("Out of range");
      }
      map.put(key, oldValue + 1);
    }
  }
 
  public Integer getCount(String key) {
    synchronized (lock) {
      return map.get(key);
    }
  }
}

class MyRunnable23 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread23 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}