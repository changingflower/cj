package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class j_13_02_basic_good_1002 {
	public static void main(String[] args) throws IOException{
		Path file = new File(args[0]).toPath();
		try {
		  Files.delete(file);			//ok
		} catch (IOException x) {
		  System.out.println("Deletion failed");
		  // Handle error
		}
	}
}
