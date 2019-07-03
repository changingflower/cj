package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.Serializable;

class j_14_01_basic_03 implements Serializable {		//
	protected static Object readResolve() {		//not compliant

		  return new Object();
	}

	protected static Object writeReplace() {	//not compliant

		  return new Object();
	}
}
