package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
class j_12_03_basic_good_1002 {
  private volatile Helper helper;
 
  public Helper getHelper() {
    return helper;
  }
 
  public void initialize() {
    helper = new Helper(42);
  }
}
 
// Immutable Helper
class Helper {
  private final int n;
 
  public Helper(int n) {
    this.n = n;
  }
  // ...
  class MyRunnable implements Runnable {
	    private int i = 0;

	    @Override
	    public void run() {
	        for (i = 0; i < 100; i++) {
	            System.out.println(Thread.currentThread().getName() + " " + i);
	        }
	    }
	}

	class MyThread extends Thread {
	    
	    private int i = 0;

	    @Override
	    public void run() {
	        for (i = 0; i < 100; i++) {
	            System.out.println(Thread.currentThread().getName() + " " + i);
	        }
	    }
	}
}
