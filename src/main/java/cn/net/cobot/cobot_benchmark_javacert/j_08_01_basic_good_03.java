package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.atomic.AtomicReference;

//check type:java 

public final class j_08_01_basic_good_03 {
  private final int n;
 
  public j_08_01_basic_good_03(int n) {
    this.n = n;
  }
  // ...
}

final class j_08_01_basic_good_03_3 {
  private final AtomicReference<j_08_01_basic_good_03> helperRef =
      new AtomicReference<j_08_01_basic_good_03>();
 
  public j_08_01_basic_good_03 getHelper() {
    return helperRef.get();
  }
 
  public void setHelper(int num) {
    helperRef.set(new j_08_01_basic_good_03(num));
  }
}
class MyRunnable4 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread4 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}