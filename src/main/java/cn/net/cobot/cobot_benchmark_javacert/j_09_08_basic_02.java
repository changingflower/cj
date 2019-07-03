package cn.net.cobot.cobot_benchmark_javacert;
import java.io.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//check type:java
public class j_09_08_basic_02 {

	private final Lock lock = new ReentrantLock();

	public void func_09_08_basic_02_bad(File file) {
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			lock.lock();
			// Perform operations on the open file
		} catch (FileNotFoundException fnf) {
			// Forward to handler
		} finally {
			lock.unlock();        //not compliant
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// Forward to handler
				}
			}
		}
	}
}
