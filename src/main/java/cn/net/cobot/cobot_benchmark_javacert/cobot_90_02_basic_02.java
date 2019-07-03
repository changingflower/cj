package cn.net.cobot.cobot_benchmark_javacert;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeakClass{

	public String format(Date date) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class ForamtCommon {
	private static SimpleDateFormat dateFormat;    
    public String format(Date date) {
        return dateFormat.format(date);    //not compliant
    }
    final WeakClass dateFormatAccess=new WeakClass();
    public void running_in_thread1(){
        System.out.println("Time in thread 1 should be 12/31/69 4:00 PM, found: "+ dateFormatAccess.format(new Date(0)));
    }
    public void running_in_thread2(){
        System.out.println("Time in thread 2 should be around 12/29/09 6:26 AM, found: "+ dateFormatAccess.format(new Date(System.currentTimeMillis())));
    }

}
