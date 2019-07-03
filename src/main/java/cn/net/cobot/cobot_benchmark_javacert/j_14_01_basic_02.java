package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.Serializable;

class j_14_01_basic_02 implements Serializable {	//
	  private Object readResolve() {		//not compliant

		  return new Object();
	  }

	  private Object writeReplace() {		//not compliant

		  return new Object();
	  }
}
