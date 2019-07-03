package cn.net.cobot.cobot_benchmark_javacert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class j_13_04_basic_02 {
	public void getResults(String sqlQuery) {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/test?" + "useUnicode=true&characterEncoding=UTF8";
			String user = "h4";
			String pass = "111";
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlQuery);
			processResults(rs);
		} catch (Exception e) {
			/* Forward to handler */
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// Forward to handler
			} finally {
				try {
					if (stmt != null) {
						stmt.close();
					}
				} catch (SQLException e) {
					// Forward to handler
				} finally {
					try {
						if (conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						// Forward to handler
					}
				}
			}
		}
	}

	private void processResults(ResultSet rs) {
		// TODO Auto-generated method stub
		
	}
}