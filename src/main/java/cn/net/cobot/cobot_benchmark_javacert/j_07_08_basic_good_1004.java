package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public interface j_07_08_basic_good_1004 {

  public static final j_07_08_basic_good_1004 NULL = new j_07_08_basic_good_1004() {
    public void write(String messageToLog) {
      // Do nothing
    }
  };

  void write(String messageToLog);
}

class Cobot_02_07_08_basic_04_good1 {
  private final j_07_08_basic_good_1004 log;

  Cobot_02_07_08_basic_04_good1(){
    this.log = j_07_08_basic_good_1004.NULL;
  }

  // ...
}
