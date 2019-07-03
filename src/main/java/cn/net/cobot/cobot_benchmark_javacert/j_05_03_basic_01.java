package cn.net.cobot.cobot_benchmark_javacert;
import java.util.ArrayList;
import java.util.List;

//check type:Java
class j_05_03_basic_01 {
	private static void addToList(List list, Object obj) {
		list.add(obj);  // Unchecked warning
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String> ();
		addToList(list, 42);//not compliant
		System.out.println(list.get(0));  // Throws ClassCastException
	}
}
