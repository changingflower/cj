package cn.net.cobot.cobot_benchmark_javacert;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

//check type:java
public class j_09_02_basic_01 {

	static DateFormat format =
		      DateFormat.getDateInstance(DateFormat.MEDIUM);

		  public Date parse(String str) throws ParseException {
		    synchronized (getClass()) {           //not compliant
		      return format.parse(str);
		    }
		  }
	public static void main(String[] args)
		  {}
}
 class Cobot_02_09_02_case1_bad_Derived extends j_09_02_basic_01 {
	static DateFormat format =
		      DateFormat.getDateInstance(DateFormat.MEDIUM);

		  public Date parse(String str) throws ParseException {
		    synchronized (Base.class) {
		      return format.parse(str);
		    }
		  }
}
