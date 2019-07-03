package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_06_basic_02 implements Runnable {

	private static volatile int counter;   
	// ...

	public synchronized void run() {
		counter++;                     //not compliant
		// ...
	}
	// ...
}
