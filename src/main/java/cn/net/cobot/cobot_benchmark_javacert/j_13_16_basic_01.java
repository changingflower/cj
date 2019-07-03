package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class j_13_16_basic_01 {
	public static void main (String args[]) throws FileNotFoundException {
		File file = new File("/img/" + args[0]);
		if (!isInSecureDir(file)) {
		  throw new IllegalArgumentException();
		}
		FileOutputStream fis = new FileOutputStream(file);	//not compliant
		// ...
	}

	private static boolean isInSecureDir(File file) {
		// TODO Auto-generated method stub
		return false;
	}
}