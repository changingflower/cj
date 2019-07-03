package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;

public class j_13_02_basic_good_1001 {
	public static void main(String[] args){
		File file = new File("file");
		if (!file.delete()) {			//ok
		  System.out.println("Deletion failed");
		}
	}
}



