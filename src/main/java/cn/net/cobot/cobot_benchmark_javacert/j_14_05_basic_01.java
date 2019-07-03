package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.Serializable;

public class j_14_05_basic_01 implements Serializable {
	  private int rank;
	  class InnerSer implements Serializable {		//not compliant
		    protected String name;

	  }
}
