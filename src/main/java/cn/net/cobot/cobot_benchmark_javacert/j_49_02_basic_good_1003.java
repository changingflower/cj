package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Random;
class j_49_02_basic_good_1003 {
	public static void main (String args[]) {
	    Random number;
	    int n;
	    //...
	    for (int i = 0; i < 20; i++) {
	      // Reseed generator
	      number = new Random();
	      // Generate another random integer in the range [0, 20]
	      n = number.nextInt(21);
	      System.out.println(n);
	    }
	}
}
