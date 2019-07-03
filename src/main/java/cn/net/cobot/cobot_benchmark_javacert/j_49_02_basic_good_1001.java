package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
// ...
class j_49_02_basic_good_1001 {
	public static void main (String args[]) {
	    SecureRandom number = new SecureRandom();
	    // Generate 20 integers 0..20
	    for (int i = 0; i < 20; i++) {
	        System.out.println(number.nextInt(21));
	    }
	}
}
