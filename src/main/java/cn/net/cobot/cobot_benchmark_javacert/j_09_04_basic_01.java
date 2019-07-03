package cn.net.cobot.cobot_benchmark_javacert;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//check type:java
public class j_09_04_basic_01{
	private final Map<Integer, String> mapView =
		    Collections.synchronizedMap(new HashMap<Integer, String>());
		private final Set<Integer> setView = mapView.keySet();
		 
		public Map<Integer, String> getMap() {
		  return mapView;
		}
		 
		public void doSomething() {
		  synchronized (setView) {  // Incorrectly synchronizes on setView  not compliant
		    for (Integer k : setView) {
		      // ...
		    }
		  }
		}

}
