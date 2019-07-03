package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

final class j_08_00_basic_good_01 implements Runnable {
  private volatile boolean done = false;
  
  @Override public void run() {
    while (!done) {
      try {
        // ...
        Thread.currentThread().sleep(1000); // Do something
      } catch(InterruptedException ie) {
        Thread.currentThread().interrupt(); // Reset interrupted status
      }
    }   
  }
 
  public void shutdown() {
    done = true;
  }
}