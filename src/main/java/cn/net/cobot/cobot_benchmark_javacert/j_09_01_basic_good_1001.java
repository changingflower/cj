package cn.net.cobot.cobot_benchmark_javacert;
//check type:java


public class j_09_01_basic_good_1001 {

	private final Object lock = new Object();

	public void func_09_01_basic_01_good() {
	  synchronized (lock) {
	    // ...
	  }
	}
}
