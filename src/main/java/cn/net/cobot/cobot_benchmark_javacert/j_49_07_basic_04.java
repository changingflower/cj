package cn.net.cobot.cobot_benchmark_javacert;
import java.io.Serializable;
import java.util.Arrays;

//check type:Java
class j_49_07_basic_04 implements Serializable {//not compliant
  private static final long serialVersionUID =
      2787342337386756967L;
  private static j_49_07_basic_04 instance;

  // Nontransient instance field
  private String[] str = {"one", "two", "three"};

  private j_49_07_basic_04() {
    // Private constructor prevents instantiation by untrusted callers
  }

  public void displayStr() {
    System.out.println(Arrays.toString(str));
  }

  private Object readResolve() {
    return instance;
  }
}
