package cn.net.cobot.cobot_benchmark_javacert;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//check type:Java

final class j_08_03_basic_03 {
  private final Map<String, Integer> map =
      Collections.synchronizedMap(new HashMap<String, Integer>());
 
  public void increment(String key) {	//not compliant
    Integer old = map.get(key);
    int oldValue = (old == null) ? 0 : old.intValue();
    if (oldValue == Integer.MAX_VALUE) {
      throw new ArithmeticException("Out of range");
    }
    map.put( key, oldValue + 1);
  }
 
  public Integer getCount(String key) {
    return map.get(key);
  }
}

class MyRunnable20 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread20 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}