package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.FileInputStream;
import java.io.IOException;

public final class j_13_08_basic_01 {

	public static void main(String[] args) throws IOException {
		FileInputStream in;
		in = new FileInputStream("file");
			// Initialize stream
		byte data;
		while ((data = (byte) in.read()) != -1) {//not compliant
			 // ...
		}
	}
}
