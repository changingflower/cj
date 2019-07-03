package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public final class j_11_01_basic_good_1002 {
  private final static ThreadPoolExecutor pool =
      new ThreadPoolExecutor(0, 10, 60L, TimeUnit.SECONDS,
                             new SynchronousQueue<Runnable>());
 // private final int numberOfTimes;
  private static AtomicInteger count = new AtomicInteger(); // count = 0
 
  static {
    pool.setRejectedExecutionHandler(
    new ThreadPoolExecutor.CallerRunsPolicy());
  }
 
  // ...
}