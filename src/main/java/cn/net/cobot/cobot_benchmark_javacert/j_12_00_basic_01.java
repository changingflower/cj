package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
class Base_bad {
  public synchronized void func_12_00_basic_01_bad() {
    // ...
  }
}

class j_12_00_basic_01 extends Base_bad {
  @Override
  public void func_12_00_basic_01_bad() {         //not compliant
    // ...
  }
}
