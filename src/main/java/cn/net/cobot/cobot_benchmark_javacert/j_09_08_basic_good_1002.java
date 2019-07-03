package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

 interface LockAction {
	void doSomethingWithFile(InputStream in);
}

public final class j_09_08_basic_good_1002 {
	private static final Lock lock = new ReentrantLock();

	public static void doSomething(File file, LockAction action) {
		InputStream in = null;
		lock.lock();
		try {
			in = new FileInputStream(file);
			action.doSomethingWithFile(in);
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

 final class Client {
	public void doSomething(File file) {
		j_09_08_basic_good_1002.doSomething(file, new LockAction() {
			public void doSomethingWithFile(InputStream in) {
				// Perform operations on the open file
			}
		});
	}
}
