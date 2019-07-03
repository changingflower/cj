package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//check type:java


public class j_09_03_basic_good_1001 {

	private final Lock lock = new ReentrantLock();

	public void func_09_03_basic_01_good() {
	  lock.lock();
	  try {
	    // ...
	  } finally {
	    lock.unlock();
	  }
	}
}
