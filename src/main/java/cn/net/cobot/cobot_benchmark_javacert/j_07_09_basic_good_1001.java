package cn.net.cobot.cobot_benchmark_javacert;
class j_07_09_basic_good_1001_1 extends SecurityManager {
	private boolean isExitAllowedFlag;

	public j_07_09_basic_good_1001_1() {
		super();
		isExitAllowedFlag = false;
	}

	public boolean isExitAllowed() {
		return isExitAllowedFlag;
	}

	@Override
	public void checkExit(int status) {
		if (!isExitAllowed()) {
			throw new SecurityException();
		}
		super.checkExit(status);
	}

	public void setExitAllowed(boolean f) {
		isExitAllowedFlag = f;
	}
}

public class j_07_09_basic_good_1001 {
	public static void main(String[] args) {
		j_07_09_basic_good_1001_1 secManager = new j_07_09_basic_good_1001_1();
		System.setSecurityManager(secManager);
		try {
			// ...
			System.exit(1); // Abrupt exit call
		} catch (Throwable x) {
			if (x instanceof SecurityException) {
				System.out.println("Intercepted System.exit()");
				// Log exception
			} else {
				// Forward to exception handler
			}
		}

		// ...
		secManager.setExitAllowed(true); // Permit exit
		// System.exit() will work subsequently
		// ...
	}
}