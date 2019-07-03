package cn.net.cobot.cobot_benchmark_javacert;
import java.util.HashMap;

public class J_49_04_good_1003 {
  private HashMap<Integer,String> hm = new HashMap<Integer, String>();
   
  private void doSomething() {
    // hm is used only here and never referenced again
    hm.put(1, "java");	//ok
    // ...
  }
  
  private void doSomethingElse(){
	hm.put(1, "java#");
  }
}