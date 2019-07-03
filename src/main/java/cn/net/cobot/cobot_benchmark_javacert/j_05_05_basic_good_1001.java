package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Date;
import java.util.Hashtable;
class j_05_05_basic_good_1001 {
	private Date d;
	  // Internal state, may contain sensitive data
	  private static Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	 
	  private   j_05_05_basic_good_1001() {
	    ht.put(1, "123-45-6666");
	    
	  }
	 
	  public Hashtable<Integer,String> getValues(){
	    return ht;
	  }
	 
	  public static void main(String[] args) {
		  j_05_05_basic_good_1001 rr = new j_05_05_basic_good_1001();
	    Hashtable<Integer, String> ht1 = rr.getValues(); // Prints sensitive data 123-45-6666
	    ht1.remove(1);                                   // Untrusted caller can remove entries
	    Hashtable<Integer, String> ht2 = rr.getValues(); // Now prints null; original entry is removed
	  }
}
