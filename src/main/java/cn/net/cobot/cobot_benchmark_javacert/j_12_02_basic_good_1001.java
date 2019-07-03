package cn.net.cobot.cobot_benchmark_javacert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//check type:java
public final class j_12_02_basic_good_1001 {
  private static Connection dbConnection;
  // Other fields ...
 
  static {
    // Initialize a database connection
    try {
      dbConnection = DriverManager.getConnection("connection string");
    } catch (SQLException e) {
      dbConnection = null;
    }
    // Other initialization (do not start any threads)
  }
 
  // ...
}

class MyRunnable47 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread47 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}