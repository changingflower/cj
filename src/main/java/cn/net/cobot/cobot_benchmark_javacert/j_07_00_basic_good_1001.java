package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_07_00_basic_good_1001 implements Runnable {
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt(); // Reset interrupted status
    }
  }
}
