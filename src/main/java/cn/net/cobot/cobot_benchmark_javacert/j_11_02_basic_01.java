package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//check type:java
 class SocketReader1 implements Runnable { // Thread-safe class
  private final Socket socket;
  private final BufferedReader in;
  private final Object lock = new Object();
 
  public SocketReader1(String host, int port) throws IOException {
    this.socket = new Socket(host, port);
    this.in = new BufferedReader(
        new InputStreamReader(this.socket.getInputStream())
    );
  }
 
  // Only one thread can use the socket at a particular time
  @Override public void run() {
    try {
      synchronized (lock) {
        readData();
      }
    } catch (IOException ie) {
      // Forward to handler
    }
  }
 
  public void readData() throws IOException {
    String string;
    try {
      while ((string = in.readLine()) != null) {
        // Blocks until end of stream (null)
      }
    } finally {
      shutdown();
    }
  }
 
  public void shutdown() throws IOException {
    socket.close();
  }
}
 
public final class j_11_02_basic_01 {
  private final ExecutorService pool;
 
  public j_11_02_basic_01(int poolSize) {
    pool = Executors.newFixedThreadPool(poolSize);
  }
 
  public void doSomething() throws InterruptedException, IOException {
    pool.submit(new SocketReader1("somehost", 8080));
    // ...
    List<Runnable> awaitingTasks = pool.shutdownNow();  //not compliant
  }
 
  public static void main(String[] args)
                          throws InterruptedException, IOException {
	  j_11_02_basic_01 service = new j_11_02_basic_01(5);
    service.doSomething();
  }
}