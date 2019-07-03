package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

//check type:Java

class j_14_06_basic_01 implements Serializable {
  private static final Date epoch = new Date(0);
  private Date date = null; // Mutable component
   
  public j_14_06_basic_01(Date d){
    date = new Date(d.getTime()); // Constructor performs defensive copying
  }
 
  private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {  // not compliant
    ois.defaultReadObject();
    // Perform validation if necessary
  }
  
}
