package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class j_13_16_basic_good_01 {
	public static void main (String args[]) throws IOException {
		File file = new File("/img/" + args[0]);
		if (!isInSecureDir(file)) {
		  throw new IllegalArgumentException();
		}
		String canonicalPath = file.getCanonicalPath();
		if (!canonicalPath.equals("/img/java/file1.txt") &&
		    !canonicalPath.equals("/img/java/file2.txt")) {
		   // Invalid file; handle error
		}
		 
		FileInputStream fis = new FileInputStream(canonicalPath);	//ok
	}

	private static boolean isInSecureDir(File file) {
		// TODO Auto-generated method stub
		return false;
	}
}