package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Date;
class j_05_04_basic_good_1002 {
  private final Date date;
 
  private j_05_04_basic_good_1002(Date d) { // Noninstantiable and nonsubclassable
    this.date = new Date(d.getTime());  // Make defensive copy
  }
 
  public Date getDate() {
    return (Date) date.clone(); // Copy and return
  }
 
  public static j_05_04_basic_good_1002 getInstance(j_05_04_basic_good_1002 mc)  {
    return new j_05_04_basic_good_1002(mc.getDate());
  }

  // public static void main(String[] args) {
  //   Date date = new Date();
  //   j_05_04_basic_01 a = new j_05_04_basic_01(date);
  //   Date b = a.getDate();
  //   System.out.println(a.getDate().getTime());
  //   b.setYear(2222);
  //   System.out.println(a.getDate().getTime());
  // }
}