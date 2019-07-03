package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public final class j_11_00_basic_good_1001 {

  public static void main(String[] args) throws IOException {
    RequestHandler.newInstance(100).handleRequest();
  }
}

final class RequestHandler {
  // private final Helper helper = new Helper();
  private final ServerSocket server;
  private final ExecutorService exec;

  private RequestHandler(int port, int poolSize) throws IOException {
    server = new ServerSocket(port);
    exec = Executors.newFixedThreadPool(poolSize);
  }

  public static RequestHandler newInstance(int poolSize)
                                           throws IOException {
    return new RequestHandler(0, poolSize);
  }

  public void handleRequest() {
    Future<?> future = exec.submit(new Runnable() {
        @Override public void run() {
          try {
            server.accept();
          } catch (IOException e) {
            // Forward to handler
          }
        }
    });
  }
  // ... Other methods such as shutting down the thread pool
  // and task cancellation ...
}
