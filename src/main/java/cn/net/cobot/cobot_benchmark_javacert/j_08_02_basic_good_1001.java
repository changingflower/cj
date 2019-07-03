package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

final class j_08_02_basic_good_1001 {
	private volatile boolean flag = true;
	 
	  public synchronized void toggle() {
	    flag ^= true; // Same as flag = !flag;
	  }
	 
	  public boolean getFlag() {
	    return flag;
	  }
}

class MyRunnable10 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread10 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}