package cn.net.cobot.cobot_benchmark_javacert;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.AccessController;
import java.security.PrivilegedAction;


public class cobot_15_00_basic_good_1001 {
	public static void changePassword() {
		FileInputStream fin = openPasswordFile();
		if (fin == null) {
			// No password file; handle error
		}

		// Test old password with password in file contents; change password
	}

	private static FileInputStream openPasswordFile() {
		final String password_file = "password";
		final FileInputStream fin[] = { null };
		AccessController.doPrivileged(new PrivilegedAction<Void>() {
			public Void run() {
				try {
					// Sensitive action; can't be done outside
					// doPrivileged() block
					fin[0] = new FileInputStream(password_file);
				} catch (FileNotFoundException x) {
					// Report to handler
				}
				return null;
			}
		});
		return fin[0];
	}
}
