package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

public class j_06_08_basic_good_1004 {
  private final int number;
 
  public j_06_08_basic_good_1004(int number) {
    this.number = number;
  }
 
  public boolean equals(Object o) {
    if (!(o.getClass() == this.getClass())) {
      return false;
    }
 
    j_06_08_basic_good_1004 c = (j_06_08_basic_good_1004)o;
    return c.number == number;
  }
 
  public int hashCode() {/* ... */return 1;}
 
}