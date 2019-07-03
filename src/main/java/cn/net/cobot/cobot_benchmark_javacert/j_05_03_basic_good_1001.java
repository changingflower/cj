package cn.net.cobot.cobot_benchmark_javacert;
import java.util.ArrayList;
import java.util.List;

//check type:Java
class j_05_03_basic_good_1001 {
	private static void addToList(List<String> list, String str) {
		list.add(str);     // No warning generated
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String> ();
		addToList(list, "42");
		System.out.println(list.get(0));
	}
}
