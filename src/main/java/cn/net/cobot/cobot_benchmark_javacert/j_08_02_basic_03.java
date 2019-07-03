package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

final class j_08_02_basic_03 {
  private volatile boolean flag = true;
 
  public void toggle() {  // Unsafe
    flag ^= true;	//not compliant
  }
 
  public boolean getFlag() { // Safe
    return flag;
  }
}

class MyRunnable7 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread7 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}