package cn.net.cobot.cobot_benchmark_javacert;
import java.sql.ResultSetMetaData;

//check type:java
//import com.mysql.jdbc.ResultSetMetaData;

public class cobot_50_00_basic_02 {

	public static void main(String[] args) {
		try {
			ResultSetMetaData metaData = null;
			String[] names = new String[metaData.getColumnCount()];
			for (int i = 0; i < names.length; i++)
				names[i] = metaData.getColumnName(i + 1);	//not compliant
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
