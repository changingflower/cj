package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_06_basic_01 implements Runnable {

	private static volatile int counter;
	// ...
	private final Object lock = new Object();   

	@Override
	public void run() {
		synchronized (lock) {
			counter++;                            //not compliant
			// ...
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(new j_09_06_basic_01()).start();
		}
	}
}
