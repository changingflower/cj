package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class j_13_01_basic_01 {

	Writer out;

	public j_13_01_basic_01() throws IOException {
		out = new FileWriter("file"); //not compliant
	}

	public static void main(String[] args){
		try {
			Writer out = new FileWriter("file");		//not compliant
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
