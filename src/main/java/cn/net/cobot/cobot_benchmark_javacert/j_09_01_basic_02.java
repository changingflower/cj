package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_09_01_basic_02 {

	private int count = 0;
	private final Integer Lock = count; // Boxed primitive Lock is shared

	public void func_09_01_basic_02_bad() {
	  synchronized (Lock) {             //not compliant
	    count++;
	    // ...
	  }
	}
}
