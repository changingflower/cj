package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_01_basic_01 {

	private final Boolean initialized = Boolean.FALSE;

	public void func_09_01_basic_01_bad() {
	  synchronized (initialized) {       //not compliant
	    // ...
	  }
	}
}
