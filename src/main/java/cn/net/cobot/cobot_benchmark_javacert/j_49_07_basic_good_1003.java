package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_49_07_basic_good_1003 {
  private static volatile j_49_07_basic_good_1003 instance;

  private j_49_07_basic_good_1003() {
    // Private constructor prevents instantiation by untrusted callers
  }

  // Double-checked locking
  public static j_49_07_basic_good_1003 getInstance() {
    if (instance == null) {
      synchronized (j_49_07_basic_good_1003.class) {
        if (instance == null) {
          instance = new j_49_07_basic_good_1003();
        }
      }
    }
    return instance;
  }
}
