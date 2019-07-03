package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_49_07_basic_05 implements Cloneable {//not compliant
  private static j_49_07_basic_05 instance;

  private j_49_07_basic_05() {
    // Private constructor prevents
    // instantiation by untrusted callers
  }

  // Lazy initialization
  public static synchronized j_49_07_basic_05 getInstance() {
    if (instance == null) {
      instance = new j_49_07_basic_05(); 
    }
    return instance;
  }
}
