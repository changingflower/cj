package cn.net.cobot.cobot_benchmark_javacert;
import java.util.HashMap;
import java.util.Map;

//check type:java
public final class j_06_09_basic_good_1001 {
  private final int number;

  public j_06_09_basic_good_1001(int number) {
    this.number = number;
  }

  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof j_06_09_basic_good_1001)) {
      return false;
    }
    j_06_09_basic_good_1001 cc = (j_06_09_basic_good_1001)o;
    return cc.number == number;
  }

  public int hashCode() {
    int result = 17;
    result = 31 * result + number;
    return result;
  }

  public static void main(String[] args) {
    Map<j_06_09_basic_good_1001, String> m = new HashMap<j_06_09_basic_good_1001, String>();
    m.put(new j_06_09_basic_good_1001(100), "4111111111111111");
    System.out.println(m.get(new j_06_09_basic_good_1001(100)));
  }
}
