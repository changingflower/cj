package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.text.DateFormat;
import java.util.Date;

public class j_04_02_basic_01 {
	public static void func_04_02_basic_01_bad1(String tag) {
		if (tag.toUpperCase().equals("SCRIPT")) {    //not compliant
			return;
		}
		// Process tag
	}

	public static void func_04_02_basic_01_bad2(Date date) {
		String myString = DateFormat.getDateInstance().format(date);   //not compliant
		System.out.println("The date is " + myString);
		if (myString.startsWith("Jun ")) {
			System.out.println("Enjoy June!");
		} else {
			System.out.println("It's not June.");
		}
	}

	public static void func_04_02_basic_01_bad3(Date date) {
		String myString = DateFormat.getDateInstance().format(date);   //not compliant
		System.out.println("The date is " + myString);
		if (myString.startsWith("Jun ")) {
			System.out.println("Enjoy June!");
		} else {
			System.out.println("It's not June.");
		}
	}

}
