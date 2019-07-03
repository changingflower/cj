package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;

public class j_13_14_basic_02 {

	public static void main(String[] args) throws FileNotFoundException {
		final PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("foo.txt")));		//not compliant
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {	//关闭挂钩
			public void run() {
				out.close();
			}
		}));
		out.println("hello");
		Runtime.getRuntime().halt(1);	//用Runtime.halt()不会执行关闭挂钩
	}
}