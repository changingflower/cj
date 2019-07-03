package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
class j_07_04_basic_01 {
  private static boolean doLogic() {
    try {
      throw new IllegalStateException();
    } finally {
      System.out.println("logic done");
      return true;      //not compliant
    }
  }
}
