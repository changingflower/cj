package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_01_basic_03 {

	private final String lock = new String("LOCK").intern();

	public void func_09_01_basic_03_bad() {
	  synchronized (lock) {          //not compliant
	    // ...
	  }
	}
}
