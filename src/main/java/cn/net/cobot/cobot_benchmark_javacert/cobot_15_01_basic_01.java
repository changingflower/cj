package cn.net.cobot.cobot_benchmark_javacert;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

class cobot_15_01_basic_01 {

	private void privilegedMethod(final String filename) throws FileNotFoundException {
		try {
			FileInputStream fis = (FileInputStream) AccessController.doPrivileged(new PrivilegedExceptionAction() {
				public FileInputStream run() throws FileNotFoundException {
					return new FileInputStream(filename);
				}
			});
			// Do something with the file and then close it
		} catch (PrivilegedActionException e) {
			// Forward to handler
		}
	}
}