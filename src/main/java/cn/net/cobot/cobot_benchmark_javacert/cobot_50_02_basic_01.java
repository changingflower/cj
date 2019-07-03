package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class cobot_50_02_basic_01 {

	public static void main(String[] args) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");	//not compliant
			md.toString();
		} catch (NoSuchAlgorithmException nsae) {
			
		}

	}
}
