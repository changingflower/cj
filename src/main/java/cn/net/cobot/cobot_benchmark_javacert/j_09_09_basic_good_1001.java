package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_09_basic_good_1001 {

	public synchronized void func_09_09_basic_01_good(long timeout)
            throws InterruptedException {
	//...
		
	while (true) {
		wait(timeout); // Immediately releases the current monitor
	}
}
}
