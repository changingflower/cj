package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class j_10_00_basic_good_1002 {

  public void sampleRunTest() {

    Thread thread = new Thread(new Runnable() {
        @Override public void run() {
          // ...
        }
      });

    ((Runnable) thread).run();  // THI00-J-EX0: Does not start a new thread
  }
}
