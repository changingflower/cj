package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.util.ArrayList;

public class j_02_06_basic_good_1001 {
	private ArrayList<String> names;
	 
	void func_02_06_basic_01_good(int index) {
	  boolean nullsRemoved = names.remove(null);
	  assert nullsRemoved; // No side effect
	  // ...
	}
}
