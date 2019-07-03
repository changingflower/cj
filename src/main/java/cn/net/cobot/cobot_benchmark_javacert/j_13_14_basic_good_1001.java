package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class j_13_14_basic_good_1001 {
	public static void main(String[] args) throws FileNotFoundException {
		final PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("foo.txt")));
		try {
			out.println("hello");
		} finally {
			try {
				out.close();	//ok 	在Runtime.exit前关闭了
			} catch (Exception x) {
				// Handle error
			}
		}
		Runtime.getRuntime().exit(1);
	}
}