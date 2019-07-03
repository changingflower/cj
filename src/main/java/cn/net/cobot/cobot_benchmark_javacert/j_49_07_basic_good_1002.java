package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_49_07_basic_good_1002 {
  private static j_49_07_basic_good_1002 instance;

  private j_49_07_basic_good_1002() {
    // Private constructor prevents instantiation by untrusted callers
  }

  // Lazy initialization
  public static synchronized j_49_07_basic_good_1002 getInstance() {
    if (instance == null) {
      instance = new j_49_07_basic_good_1002();
    }
    return instance;
  }
}
