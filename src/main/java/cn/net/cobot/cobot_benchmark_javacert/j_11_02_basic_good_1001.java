package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//check type:java
 class SocketReaderGood implements Runnable {
  private final SocketChannel sc;
  private final Object lock = new Object();
 
  public SocketReaderGood(String host, int port) throws IOException {
    sc = SocketChannel.open(new InetSocketAddress(host, port));
  }
 
  @Override public void run() {
    ByteBuffer buf = ByteBuffer.allocate(1024);
    try {
      synchronized (lock) {
        while (!Thread.interrupted()) {
          sc.read(buf);
          // ...
        }
      }
    } catch (IOException ie) {
      // Forward to handler
    }
  }
}
 
public final class j_11_02_basic_good_1001 {
  private final ExecutorService pool;
 
  public j_11_02_basic_good_1001(int poolSize) {
    pool = Executors.newFixedThreadPool(poolSize);
  }
 
  public void doSomething() throws InterruptedException, IOException {
    pool.submit(new SocketReaderGood("somehost", 8080));
    // ...
    List<Runnable> awaitingTasks = pool.shutdownNow();
  }
 
  public static void main(String[] args)
                          throws InterruptedException, IOException {
	  j_11_02_basic_good_1001 service = new j_11_02_basic_good_1001(5);
    service.doSomething();
  }
}