package cn.net.cobot.cobot_benchmark_javacert;
import java.util.HashMap;

public class J_49_04_basic_01 {
  private HashMap<Integer,String> hm = new HashMap<Integer, String>();	//not compliant
   
  private void doSomething() {
    // hm is used only here and never referenced again
    hm.put(1, "java");
    // ...
  }
}