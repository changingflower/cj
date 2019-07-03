package cn.net.cobot.cobot_benchmark_javacert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class j_13_04_basic_03 {
	public void getResults(String sqlQuery) throws ClassNotFoundException {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/test?" + "useUnicode=true&characterEncoding=UTF8";
			String user = "h4";
			String pass = "111";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);		
			Statement stmt = conn.createStatement();		
			// not close
			ResultSet rs = stmt.executeQuery(sqlQuery);		//not compliant
			processResults(rs);
			// not in finally
			stmt.close();	//not compliant
			conn.close();	//not compliant
		} catch (SQLException e) {
			/* Forward to handler */
		} 
	}

	private void processResults(ResultSet rs) {
		// TODO Auto-generated method stub
		
	}
}