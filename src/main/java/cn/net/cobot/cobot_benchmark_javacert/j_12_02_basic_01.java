package cn.net.cobot.cobot_benchmark_javacert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//check type:java
public final class j_12_02_basic_01 {
  private static Connection dbConnection;
  // Other fields ...
 
  static {
    Thread dbInitializerThread = new Thread(new Runnable() {
        @Override public void run() {
          // Initialize the database connection
          try {
            dbConnection = DriverManager.getConnection("connection string");
          } catch (SQLException e) {
            dbConnection = null;
          }
        }
    });
 
    // Other initialization, for example, start other threads
 
    dbInitializerThread.start();
    try {
      dbInitializerThread.join();    // not compliant
    } catch (InterruptedException ie) {
      throw new AssertionError(ie);
    }
  }
 
  public static Connection getConnection() {
    if (dbConnection == null) {
      throw new IllegalStateException("Error initializing connection");
    }
    return dbConnection;
  }
 
  public static void main(String[] args) {
    // ...
    Connection connection = getConnection();
  }
}

class MyRunnable48 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread48 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
