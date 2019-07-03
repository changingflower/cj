package cn.net.cobot.cobot_benchmark_javacert;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

//check type:java


public class j_02_09_02_basic_good_1003 {
	static DateFormat format =
		      DateFormat.getDateInstance(DateFormat.MEDIUM);

		  public Date parse(String str) throws ParseException {
		    try {
		      synchronized (Class.forName("Base")) {
		        return format.parse(str);
		      }
		    } catch (ClassNotFoundException x) {
		      // "Base" not found; handle error
		    }
		    return null;
		  }
}
