package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
class j_07_04_basic_good_1001 {
  private static boolean doLogic() {
    try {
      throw new IllegalStateException();
    } finally {
      System.out.println("logic done");
    }
    // Any return statements must go here;
    // applicable only when exception is thrown conditionally
  }
}