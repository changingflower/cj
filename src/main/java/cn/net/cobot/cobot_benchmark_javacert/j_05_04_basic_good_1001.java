package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Date;

public final class j_05_04_basic_good_1001 { // Copy constructor
  private final Date date;
 
  public j_05_04_basic_good_1001(j_05_04_basic_good_1001 mc)  {
    this.date = new Date(mc.date.getTime());
  }
 
  public j_05_04_basic_good_1001(Date d) {
    this.date = new Date(d.getTime());  // Make defensive copy
  }
 
  public Date getDate() {
    return (Date) date.clone(); // Copy and return
  }
}