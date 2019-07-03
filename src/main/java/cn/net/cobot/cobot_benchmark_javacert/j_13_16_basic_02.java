package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class j_13_16_basic_02 {
	public static void main (String args[]) throws IOException {
		File file = new File("/img/" + args[0]);
		if (!isInSecureDir(file)) {
		  throw new IllegalArgumentException();
		}
		String canonicalPath = file.getCanonicalPath();
		FileOutputStream fis = new FileOutputStream(canonicalPath);		//not compliant
		// ...
	}

	private static boolean isInSecureDir(File file) {
		// TODO Auto-generated method stub
		return false;
	}
}