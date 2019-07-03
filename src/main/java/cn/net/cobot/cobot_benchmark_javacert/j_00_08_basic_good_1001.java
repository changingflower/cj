package cn.net.cobot.cobot_benchmark_javacert;
import java.util.regex.Pattern;

//check type:Java
public class j_00_08_basic_good_1001{
	public static void FindLogEntry(String search) {
	    // Sanitize search string
	    StringBuilder sb = new StringBuilder(search.length());
	    for (int i = 0; i < search.length(); ++i) {
	        char ch = search.charAt(i);
	        if (Character.isLetterOrDigit(ch) || ch == ' ' || ch == '\'') {
	            sb.append(ch);
	        }
	    }
	    search = sb.toString();
	 
	    // Construct regex dynamically from user string
	    String regex = "(.*? +public\\[\\d+\\] +.*" + search + ".*)";
	    Pattern searchPattern = Pattern.compile(regex);
	}
}
