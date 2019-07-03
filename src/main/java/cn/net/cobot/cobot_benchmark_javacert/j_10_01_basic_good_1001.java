package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//check type:java
public final class j_10_01_basic_good_1001 {
  private final ExecutorService executor;

  j_10_01_basic_good_1001(int poolSize) {
    this.executor = Executors.newFixedThreadPool(poolSize);
  }

  public void startThreads() {
    for (int i = 0; i < 3; i++) {
      executor.execute(new HandleRequest());
    }
  }

  public void shutdownPool() {
    executor.shutdown();
  }

  public static void main(String[] args)  {
    j_10_01_basic_good_1001 nh = new j_10_01_basic_good_1001(3);
    nh.startThreads();
    nh.shutdownPool();
  }
}
