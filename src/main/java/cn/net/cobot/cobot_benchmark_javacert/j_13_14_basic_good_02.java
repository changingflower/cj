package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class j_13_14_basic_good_02 {
	public static void main(String[] args) throws FileNotFoundException {
		final PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("foo.txt")));
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				out.close();
			}
		}));
		out.println("hello");
		Runtime.getRuntime().exit(1);	//ok  用Runtime.exit替换原先的Runtime.halt则可以关闭挂钩
	}
}