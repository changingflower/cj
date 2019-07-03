package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//check type:Java

final class j_08_02_basic_good_1004 {
	private boolean flag = true;
	  private final ReadWriteLock lock = new ReentrantReadWriteLock();
	  private final Lock readLock = lock.readLock();
	  private final Lock writeLock = lock.writeLock();
	 
	  public void toggle() {
	    writeLock.lock();
	    try {
	      flag ^= true; // Same as flag = !flag;
	    } finally {
	      writeLock.unlock();
	    }
	  }
	 
	  public boolean getFlag() {
	    readLock.lock();
	    try {
	      return flag;
	    } finally {
	      readLock.unlock();
	    }
	  }
}

class MyRunnable13 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread13 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}