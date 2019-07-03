package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;

public class j_13_14_basic_01 {

	public static void main(String[] args) throws FileNotFoundException {
		final PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("foo.txt")));		//not compliant
		out.println("hello");
		Runtime.getRuntime().exit(1);	//用Runtime.exit()終止前沒有close
	}
}