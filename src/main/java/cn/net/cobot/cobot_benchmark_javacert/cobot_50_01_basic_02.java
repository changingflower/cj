package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.io.File;
import org.jdom.output.XMLOutputter;	//not compliant

public class cobot_50_01_basic_02 {

	public static void main(String[] args) {
		File f = new File("C:/temp");
		if (!f.exists()) {
			f.mkdir();
		}
		String[] files = f.list();
	}
}