package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//check type:java

public class j_09_08_basic_good_1001 {

	private final Lock lock = new ReentrantLock();

	public void func_09_08_basic_01_good(File file) {
		InputStream in = null;
		lock.lock();
		try {
			in = new FileInputStream(file);
			// Perform operations on the open file
		} catch (FileNotFoundException fnf) {
			// Forward to handler
		} finally {
			lock.unlock();

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
