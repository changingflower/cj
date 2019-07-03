package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
public final class j_10_00_basic_01 implements Runnable {

  @Override public void run()	{ /*...*/ }
  public static void func_10_00_basic_01_bad(String[] args) {
		j_10_00_basic_01 foo = new j_10_00_basic_01();
   		 new Thread(foo).run();                //not compliant
  }
}
