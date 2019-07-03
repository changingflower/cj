package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//check type:java
public final class j_11_01_basic_01 {
  private final ExecutorService pool;
  public j_11_01_basic_01(int poolSize) {
    pool = Executors.newFixedThreadPool(poolSize);
  }
  public void shutdown() {
    pool.shutdown();
  }
  public StringBuilder fieldAggregator(String... inputs)
      throws InterruptedException, ExecutionException {
    StringBuilder sb = new StringBuilder();
    // Stores the results
    Future<String>[] results = new Future[inputs.length];
    // Submits the tasks to thread pool
    for (int i = 0; i < inputs.length; i++) {
      results[i] = pool.submit(
        new ValidateInput<String>(inputs[i], pool));
    }
    for (int i = 0; i < inputs.length; i++) { // Aggregates the results
      sb.append(results[i].get());
    }
    return sb;
  }
}
 class ValidateInput<V> implements Callable<V> {
  private final V input;
  private final ExecutorService pool1;
  ValidateInput(V input, ExecutorService pool) {
    this.input = input;
    this.pool1 = pool;
  }
  @Override public V call() throws Exception {
    // If validation fails, throw an exception here
    // Subtask
    Future<V> future = pool1.submit(new SanitizeInput2<V>(input));  //not compliant
    return (V) future.get();
  }
}
 class SanitizeInput2<V> implements Callable<V> {
  private final V input;
 
  SanitizeInput2(V input) {
    this.input = input;
  }
  @Override public V call() throws Exception {
    // Sanitize input and return
    return (V) input;
  }
}