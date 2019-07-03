package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class j_04_02_basic_good_1001 {
	public static void processTag(String tag) {
		if (tag.toUpperCase(Locale.ENGLISH).equals("SCRIPT")) {
			return;
		}
  // Process tag
	}

	public static void processTag2(String tag) {
		if (tag.equalsIgnoreCase("SCRIPT")) {
			return;
		}
  // Process tag
	}

	public static void isJune(Date date) {
		Calendar rightNow = Calendar.getInstance();
		String myString = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US).format(rightNow.getTime());
		System.out.println("The date is " + myString);
		if (myString.startsWith("Jun ")) {
			System.out.println("Enjoy June!");
		} else {
			System.out.println("It's not June.");
		}
	}
}
