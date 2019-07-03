package cn.net.cobot.cobot_benchmark_javacert;
//check type:java


public class j_09_01_basic_good_1002 {

	private int count = 0;
	private final Integer Lock = new Integer(count);

	public void func_09_01_basic_02_good() {
	  synchronized (Lock) {
	    count++;
	    // ...
	  }
	}
}
