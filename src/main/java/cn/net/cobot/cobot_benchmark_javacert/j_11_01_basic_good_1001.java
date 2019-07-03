package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//check type:java
public final class j_11_01_basic_good_1001 {
  private final ExecutorService pool;
  public j_11_01_basic_good_1001(int poolSize) {
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
        new ValidateInput12<String>(inputs[i]));
    }
    for (int i = 0; i < inputs.length; i++) { // Aggregates the results
      sb.append(results[i].get());
    }
    return sb;
  }
  
 
}
 class ValidateInput12<V> implements Callable<V> {
  private final V input;
  
  ValidateInput12(V input) {
    this.input = input;
    
  }
  @Override public V call() throws Exception {
    // If validation fails, throw an exception here
    // Subtask
	 return (V) new SanitizeInput22().sanitize(input);
   
  }
}
 class SanitizeInput22<V>  {
  
 
  public V sanitize(V input) {
	    // Sanitize input and return
	    return input;
	  }
}