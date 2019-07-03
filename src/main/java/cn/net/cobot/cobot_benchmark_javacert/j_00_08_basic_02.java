package cn.net.cobot.cobot_benchmark_javacert;
import java.util.regex.Pattern;

//check type:Java

public class j_00_08_basic_02 {
    // Sanitize search string
	public static void FindLogEntry(String search) {
		Pattern searchPattern = Pattern.compile(search);   // not compliant
	}
	
	public static void main(String args[]){
			FindLogEntry(args[0]);
	}
}