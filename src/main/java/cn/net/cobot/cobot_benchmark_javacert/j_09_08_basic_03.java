package cn.net.cobot.cobot_benchmark_javacert;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//check type:java
public class j_09_08_basic_03 {
	private final Date date = new Date();

	private final Lock lock = new ReentrantLock();

	// str could be null
	public void func_09_08_basic_03_bad(String str) {//漏报
		lock.lock();
		String dateString = date.toString();
		if (str.equals(dateString)) {
			// ...
		}
		// ...

		lock.unlock();                  //not compliant
	}
}
