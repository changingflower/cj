package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
class J_00_00_basic_01 {
  public Connection getConnection() throws SQLException {
	  Connection ct = DriverManager.getConnection("","","");  
	  return ct;
  }
 
  String hashPassword(char[] password) {return "";
    // Create hash of password
  }
 
  public void doPrivilegedAction(String username, char[] password)
                                 throws SQLException {
    Connection connection = getConnection();
    if (connection == null) {
      // Handle error
    }
    try {
      String pwd = hashPassword(password);
 
      String sqlString = "SELECT * FROM db_user WHERE username = '"
                         + username +
                         "' AND password = '" + pwd + "'";
      Statement stmt = connection.createStatement();
      ResultSet rs = stmt.executeQuery(sqlString);	//not compliant
 
      if (!rs.next()) {
        throw new SecurityException(
          "User name or password incorrect"
        );
      }
 
      // Authenticated; proceed
    } finally {
      try {
        connection.close();
      } catch (SQLException x) {
        // Forward to handler
      }
    }
  }
}