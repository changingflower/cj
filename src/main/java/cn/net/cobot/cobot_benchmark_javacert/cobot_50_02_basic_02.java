package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.io.File;
import java.io.IOException;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class cobot_50_02_basic_02 {

	public static void main(String[] args) {
		try {
			Files.toString(new File("C:"), Charsets.UTF_8);	//not compliant
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
