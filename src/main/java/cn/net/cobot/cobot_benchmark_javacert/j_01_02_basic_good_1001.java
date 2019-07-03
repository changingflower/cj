package cn.net.cobot.cobot_benchmark_javacert;
import java.util.ArrayList;
import java.util.List;

//check type:Java
public class j_01_02_basic_good_1001{
	public void bad() {
		List<Integer> list = new ArrayList();
		boolean first = true;

		System.out.println("Processing list...");
		for (final Integer i: list) {//not compliant
		  if (first) {
		    first = false;
		  }
		  System.out.println(" New item: " + i);
		  // Process i
		}

		System.out.println("Modified list?");
		for (Integer i: list) {
		  System.out.println("List item: " + i);
		}
	}
}
