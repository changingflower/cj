package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;

public class j_13_02_basic_01 {
	public static void main(String[] args){
		File file = new File(args[0]);
		file.delete();			//not compliant
	}
}
