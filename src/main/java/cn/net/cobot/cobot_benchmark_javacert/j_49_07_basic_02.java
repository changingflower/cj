package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_49_07_basic_02 {
  private static j_49_07_basic_02 instance;

  private j_49_07_basic_02() {
    // Private constructor prevents instantiation by untrusted callers
  }

  // Lazy initialization
  public static j_49_07_basic_02 getInstance() { //not compliant // Not synchronized
    if (instance == null) {
      instance = new j_49_07_basic_02();
    }
    return instance;
  }
}
