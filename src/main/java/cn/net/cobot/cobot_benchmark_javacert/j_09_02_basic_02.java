package cn.net.cobot.cobot_benchmark_javacert;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

//check type:java

public class j_09_02_basic_02 {
	 static DateFormat format =
		      DateFormat.getDateInstance(DateFormat.MEDIUM);

		  public Date parse(String str) throws ParseException {
		    synchronized (getClass()) {            //not compliant     // Intend to synchronizes on Base.class
		      return format.parse(str);
		    }
		  }

		  public Date doSomething(String str) throws ParseException {
		    return new Helper().doSomethingAndParse(str);
		  }

		  private class Helper {
		    public Date doSomethingAndParse(String str) throws ParseException {
		      synchronized (getClass()) {       //not compliant       // Synchronizes on Helper.class
		        // ...
		        return format.parse(str);
		      }
		    }
		  }
}
