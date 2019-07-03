package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.FileReader;
import java.io.IOException;

public final class j_13_08_basic_02 {

	public static void main(String[] args) throws IOException {
		FileReader in;
		// Initialize stream
		in = new FileReader("file");
		char data;
		while ((data = (char) in.read()) != -1) {//not compliant
		  // ...
		}
	}
}
