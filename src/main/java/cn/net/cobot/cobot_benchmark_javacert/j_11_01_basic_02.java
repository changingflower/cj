package cn.net.cobot.cobot_benchmark_javacert;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class j_11_01_basic_02 {
  private final ExecutorService pool = Executors.newFixedThreadPool(10); //not compliant
  private final int numberOfTimes;
  private static AtomicInteger count = new AtomicInteger(); // count = 0
 
  public j_11_01_basic_02(int n) {
    numberOfTimes = n;
  }
 
  public void perUser() {
    methodInvoker(numberOfTimes, "perProfile");
    pool.shutdown();
  }
 
  public void perProfile() {
    methodInvoker(numberOfTimes, "perTab");
  }
 
  public void perTab() {
    methodInvoker(numberOfTimes, "doSomething");
  }
 
  public void doSomething() {
    System.out.println(count.getAndIncrement());
  }
 
  public void methodInvoker(int n, final String method) {
    final j_11_01_basic_02 manager = this;
    Callable<Object> callable = new Callable<Object>() {
      @Override public Object call() throws Exception {
        Method meth = manager.getClass().getMethod(method);
        return meth.invoke(manager);
      }
    };
 
    Collection<Callable<Object>> collection =
        Collections.nCopies(n, callable);
    try {
      Collection<Future<Object>> futures = pool.invokeAll(collection);
    } catch (InterruptedException e) {
      // Forward to handler
      Thread.currentThread().interrupt(); // Reset interrupted status
    }
    // ...
  }
 
  public static void main(String[] args) {
	j_11_01_basic_02 manager = new j_11_01_basic_02(5);
    manager.perUser();
  }
}