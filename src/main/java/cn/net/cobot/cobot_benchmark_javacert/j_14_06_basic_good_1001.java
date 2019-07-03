package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

//check type:Java

class j_14_06_basic_good_1001 implements Serializable {
  private static final Date epoch = new Date(0);
  private Date date = null; // Mutable component
   
  public j_14_06_basic_good_1001(Date d){
    date = new Date(d.getTime()); // Constructor performs defensive copying
  }
 
  private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
	  ObjectInputStream.GetField fields = ois.readFields();
	  Date inDate = (Date) fields.get("date", epoch);
	  // Defensively copy the mutable component
	  date = new Date(inDate.getTime());
	  // Perform validation if necessary
	}
}
