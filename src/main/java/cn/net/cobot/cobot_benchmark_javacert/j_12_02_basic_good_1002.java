package cn.net.cobot.cobot_benchmark_javacert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//check type:java
public final class j_12_02_basic_good_1002 {
  private static final ThreadLocal<Connection> connectionHolder
                       = new ThreadLocal<Connection>() {
   @Override public Connection initialValue() {
     try {
       Connection dbConnection =
           DriverManager.getConnection("connection string");
       return dbConnection;
     } catch (SQLException e) {
       return null;
     }
   }
 };
 
  // Other fields ...
 
  static {
    // Other initialization (do not start any threads)
  }
 
  public static Connection getConnection() {
    Connection connection = connectionHolder.get();
    if (connection == null) {
      throw new IllegalStateException("Error initializing connection");
    }
    return connection;
  }
 
  public static void main(String[] args) {
    // ...
    Connection connection = getConnection();
  }
}

class MyRunnable49 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread49 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}