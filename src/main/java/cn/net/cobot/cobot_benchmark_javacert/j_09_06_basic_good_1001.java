package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_06_basic_good_1001 implements Runnable {

	private static int counter;
	// ...
	private static final Object lock = new Object();

	public void run() {
		synchronized (lock) {
			counter++;
			// ...
		}
	}
	// ...
}
