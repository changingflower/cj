package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

public class j_06_08_basic_02 {
  private final int number;
 
  public j_06_08_basic_02(int number) {
    this.number = number;
  }
 
  public boolean equals(Object o) {
    if (!(o instanceof j_06_08_basic_02)) {
      return false;
    }
 
    j_06_08_basic_02 c = (j_06_08_basic_02)o;
    return c.number == number;
  }
 
  public int hashCode() {/* ... */return 1;}
 
}
 
class Xj_06_08_basic_02 extends j_06_08_basic_02 {
  private String type;
  public Xj_06_08_basic_02(int number, String type) {
    super(number);
    this.type = type;
  }
 
  public boolean equals(Object o) {	//not compliant
    if (!(o instanceof j_06_08_basic_02)) {
      return false;
    }
 
    // Normal Card, do not compare type
    if (!(o instanceof Xj_06_08_basic_02)) {
      return o.equals(this);
    }
 
    // It is an XCard, compare type as well
    Xj_06_08_basic_02 xc = (Xj_06_08_basic_02)o;
    return super.equals(o) && xc.type == type;
  }
 
  public int hashCode() {/* ... */return 1;}
 
  public static void main(String[] args) {
    Xj_06_08_basic_02 p1 = new Xj_06_08_basic_02(1, "type1");
    j_06_08_basic_02 p2 = new j_06_08_basic_02(1);
    Xj_06_08_basic_02 p3 = new Xj_06_08_basic_02(1, "type2");
    System.out.println(p1.equals(p2)); // Returns true
    System.out.println(p2.equals(p3)); // Returns true
    System.out.println(p1.equals(p3)); // Returns false
                                       // violating transitivity
  }
}