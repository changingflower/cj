package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.util.ArrayList;

public class j_02_06_basic_01 {

	private ArrayList<String> names;
	 
	void func_02_06_basic_01_bad(int index) {
	  assert names.remove(null); //not compliant ---- side effect
	  // ...
	}

}
