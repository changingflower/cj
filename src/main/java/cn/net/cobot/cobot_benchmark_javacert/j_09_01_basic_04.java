package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_01_basic_04 {

	// This bug was found in jetty-6.1.3 BoundedThreadPool
	private final String lock = "LOCK";

	public void func_09_01_basic_04_bad() {
	  synchronized (lock) {        //not compliant
	    // ...
	  }
	}
}
