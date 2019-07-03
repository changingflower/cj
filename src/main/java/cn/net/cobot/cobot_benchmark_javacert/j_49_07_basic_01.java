package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_49_07_basic_01 {
  private static j_49_07_basic_01 instance;

  protected j_49_07_basic_01() {   //not compliant
    instance = new j_49_07_basic_01();
  }

  public static synchronized j_49_07_basic_01 getInstance() {
    return instance;
  }
}
