package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class j_13_14_basic_good_1002 {
	public static void main(String[] args) throws FileNotFoundException {
		final PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("foo.txt")));
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			public void run() {
				out.close();
			}
		}));
		out.println("hello");
		Runtime.getRuntime().exit(1);	//ok  鐢≧untime.exit鏇挎崲鍘熷厛鐨凴untime.halt鍒欏彲浠ュ叧闂寕閽�
	}
}