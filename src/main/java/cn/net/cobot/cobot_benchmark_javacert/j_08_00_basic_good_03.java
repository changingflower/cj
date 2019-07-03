package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 


final class j_08_00_basic_good_03 implements Runnable {
  private boolean done = false;
  
  @Override public void run() {
    while (!isDone()) {
      try {
        // ...
        Thread.currentThread().sleep(1000); // Do something
      } catch(InterruptedException ie) {
        Thread.currentThread().interrupt(); // Reset interrupted status
      }
    }   
  }
 
  public synchronized boolean isDone() {
    return done;
  }
 
  public synchronized void shutdown() {
    done = true;
  }
}