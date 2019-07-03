package cn.net.cobot.cobot_benchmark_javacert;
import java.io.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//check type:java

public class j_09_08_basic_01 {

	private final Lock lock1 = new ReentrantLock();

	public void func_09_08_basic_01_bad(File file) {
		InputStream in = null;
		try {
			lock1.lock();
			in = new FileInputStream(file);

			// Perform operations on the open file

			lock1.unlock();                    //not compliant
		} catch (FileNotFoundException x) {
			// Handle exception
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException x) {
					// Handle exception
				}
			}
		}
	}
}
