package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_49_07_basic_03 {
  private static  j_49_07_basic_03 instance;

  private j_49_07_basic_03() {
    // Private constructor prevents instantiation by untrusted callers
  }

  //check type:Java
  public static j_49_07_basic_03 getInstance() { //not compliant
    if (instance == null) {
      synchronized (j_49_07_basic_03.class) {
        instance = new j_49_07_basic_03();
      }
    }
    return instance;
  }

}
