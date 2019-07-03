package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
public class cobot_50_05_basic_03 {

	public static void main(String[] args) {
		String a = "b(c";
    	System.out.println(a.replaceFirst("(", ""));	//not compliant
	}
}
