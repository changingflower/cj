package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class j_09_08_basic_good_1003 {

	private final Date date = new Date();

	private final Lock lock = new ReentrantLock();

	// str could be null
	public void func_09_08_basic_03_good(String str) {
		lock.lock();
		try {
			String dateString = date.toString();
			if (str != null && str.equals(dateString)) {
				// ...
			}
			// ...

		} finally {
			lock.unlock();
		}
	}
}
