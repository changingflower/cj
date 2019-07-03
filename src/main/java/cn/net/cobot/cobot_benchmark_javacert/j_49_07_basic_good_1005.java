package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_49_07_basic_good_1005 implements Cloneable {
  private static j_49_07_basic_good_1005 instance;

  private j_49_07_basic_good_1005() {
    // Private constructor prevents instantiation by untrusted callers
  }

  // Lazy initialization
  public static synchronized j_49_07_basic_good_1005 getInstance() {
    if (instance == null) {
      instance = new j_49_07_basic_good_1005();
    }
    return instance;
  }

  public Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }
}
