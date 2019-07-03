package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.Serializable;

class j_14_01_basic_good_1002 implements Serializable {
	protected Object readResolve() {
	    // ...
		  return new Object();
	}

	protected Object writeReplace() {
	    // ...
		  return new Object();
	}
}
