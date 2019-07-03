package cn.net.cobot.cobot_benchmark_javacert;
import java.util.regex.Pattern;

//check type:Java
public class j_00_08_basic_good_1002 {
	public static void FindLogEntry(String search) {
	    // Sanitize search string
	    search = Pattern.quote(search);
	    // Construct regex dynamically from user string
	    String regex = "(.*? +public\\[\\d+\\] +.*" + search + ".*)";
	    Pattern searchPattern = Pattern.compile(regex);
	}
}
