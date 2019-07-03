package cn.net.cobot.cobot_benchmark_javacert;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
//check type:java


public class j_02_09_02_basic_good_1002 {

	 static DateFormat format =
		      DateFormat.getDateInstance(DateFormat.MEDIUM);
	  public Date parse(String str) throws ParseException {
		 
	    synchronized (Base.class) {
	      return  format.parse(str);
	    }
	  }

	  private class Helper {
	    public Date doSomethingAndParse(String str) throws ParseException {
	    	
	      synchronized (Base.class) { // Synchronizes on Base class literal
	        // ...
	        return format.parse(str);
	      }
	    }
	  }
}
