package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class j_09_03_basic_01 {

	private final Lock lock = new ReentrantLock();

	public void func_09_03_basic_01_bad() {
	  synchronized(lock) {        //not compliant
	    // ...
	  }
	}
}
