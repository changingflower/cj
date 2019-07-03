package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//check type:java
final class j_11_03_basic_good_1001 {
  // The values have been hard-coded for brevity
  ExecutorService pool = new CustomThreadPoolExecutor(
      10, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
  // ...
}
 
class CustomThreadPoolExecutor extends ThreadPoolExecutor {
  // ... Constructor ...
  public CustomThreadPoolExecutor(
      int corePoolSize, int maximumPoolSize, long keepAliveTime,
      TimeUnit unit, BlockingQueue<Runnable> workQueue) {
    super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
  }
 
 
  @Override
  public void afterExecute(Runnable r, Throwable t) {
    super.afterExecute(r, t);
    if (t != null) {
      // Exception occurred, forward to handler
    }
    // ... Perform task-specific cleanup actions
  }
 
  @Override
  public void terminated() {
    super.terminated();
    // ... Perform final clean-up actions
  }
}
