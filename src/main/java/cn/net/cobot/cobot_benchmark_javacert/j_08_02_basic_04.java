package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

final class j_08_02_basic_04 {
  private int a;
  private int b;
 
  public int getSum() {
    return a + b;	//not compliant
  }
 
  public void setValues(int a, int b) {
    this.a = a;
    this.b = b;
  }
}

class MyRunnable8 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread8 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}