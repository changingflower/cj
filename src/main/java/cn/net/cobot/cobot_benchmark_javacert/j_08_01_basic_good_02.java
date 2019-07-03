package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public final class j_08_01_basic_good_02 {
  private final int n;
 
  public j_08_01_basic_good_02(int n) {
    this.n = n;
  }
  // ...
}

final class j_08_01_basic_good_02_2 {
	private volatile j_08_01_basic_good_02 helper;
	 
	public j_08_01_basic_good_02 getHelper() {
	  return helper;
	}
	 
	public void setHelper(int num) {
	  helper = new j_08_01_basic_good_02(num);
	}
}
class MyRunnable3 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread3 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}