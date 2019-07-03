package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
class Super_bad {
  protected void func_06_04_basic_01_bad() {
    System.out.println("Super invoked");
  }
}

public class j_06_04_basic_01 extends Super_bad {
  public void func_06_04_basic_01_bad() {         //not compliant
    System.out.println("Sub invoked");
    // Do sensitive operations
  }
}
