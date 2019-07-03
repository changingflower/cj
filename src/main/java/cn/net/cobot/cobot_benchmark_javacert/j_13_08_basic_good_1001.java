package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.FileInputStream;
import java.io.IOException;

public final class j_13_08_basic_good_1001 {

	public static void main(String[] args) throws IOException {
		FileInputStream in;
		// Initialize stream
		in = new FileInputStream("file");
		int inbuff;
		byte data;
		while ((inbuff = in.read()) != -1) {
		  data = (byte) inbuff;
		  // ...
		}
	}
}
