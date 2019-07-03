package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

final class j_08_02_basic_01 {
  private boolean flag = true;
 
  public void toggle() {  // Unsafe
    flag = !flag;	//not compliant
  }
 
  public boolean getFlag() { // Unsafe
    return flag;
  }
}

class MyRunnable5 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread5 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}