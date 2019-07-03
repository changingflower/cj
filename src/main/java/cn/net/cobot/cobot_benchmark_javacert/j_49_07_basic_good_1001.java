package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_49_07_basic_good_1001 {
  private static final j_49_07_basic_good_1001 instance = new j_49_07_basic_good_1001();

  private j_49_07_basic_good_1001() {
    // Private constructor prevents instantiation by untrusted callers
  }

  public static synchronized j_49_07_basic_good_1001 getInstance() {
    return instance;
  }
}
