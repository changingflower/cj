package cn.net.cobot.cobot_benchmark_javacert;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cobot_90_02_basic_good_01 {
	public class Common {
	    private SimpleDateFormat dateFormat; 
	    public synchronized String format1(Date date) {
	        return dateFormat.format(date);
	    }
	    public String format2(Date date) {
	        synchronized(dateFormat)
	        {
	            return dateFormat.format(date);
	        }
	    }
	}
}
