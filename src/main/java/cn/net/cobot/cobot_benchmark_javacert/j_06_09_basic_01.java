package cn.net.cobot.cobot_benchmark_javacert;
import java.util.HashMap;
import java.util.Map;

//check type:java
public final class j_06_09_basic_01 {
  private final int number;

  public j_06_09_basic_01(int number) {
    this.number = number;
  }

  public boolean equals(Object o) {     //not compliant
    if (o == this) {
      return true;
    }
    if (!(o instanceof j_06_09_basic_01)) {
      return false;
    }
    j_06_09_basic_01 cc = (j_06_09_basic_01)o;
    return cc.number == number;
  }

  public static void main(String[] args) {
    Map<j_06_09_basic_01, String> m = new HashMap<j_06_09_basic_01, String>();
    m.put(new j_06_09_basic_01(100), "4111111111111111");
    System.out.println(m.get(new j_06_09_basic_01(100)));
  }
}
