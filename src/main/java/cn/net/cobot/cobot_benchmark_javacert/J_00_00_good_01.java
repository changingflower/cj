package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class J_00_00_good_01 extends HttpServlet {
 
	public void doPrivilegedAction(String username, char[] password) throws SQLException {
		 Connection connection = DriverManager.getConnection("","","");  
	  if (connection == null) {
	    // Handle error
	  }
	  try {
	    String pwd = "";
	 
	    // Validate username length
	    if (username.length() > 8) {
	      // Handle error
	    }
	 
	    String sqlString =
	      "select * from db_user where username=? and password=?";
	    PreparedStatement stmt = connection.prepareStatement(sqlString);
	    stmt.setString(1, username);
	    stmt.setString(2, pwd);
	    ResultSet rs = stmt.executeQuery();
	    if (!rs.next()) {
	      throw new SecurityException("User name or password incorrect");
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