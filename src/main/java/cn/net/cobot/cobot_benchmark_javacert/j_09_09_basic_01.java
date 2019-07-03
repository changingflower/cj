package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_09_basic_01 {

	public synchronized void func_09_09_basic_01_bad(long time) throws InterruptedException {
		// ...
		Thread.sleep(time);            //not compliant
	}
}
