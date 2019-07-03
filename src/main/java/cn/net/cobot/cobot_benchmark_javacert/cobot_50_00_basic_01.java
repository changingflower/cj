package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.io.File;

public class cobot_50_00_basic_01 {

	public static void main(String[] args) {
		File f = new File("C:/temp");
		if (!f.exists()) {
			f.mkdir();	//not compliant
		}
		String[] files = f.list();
	}
}