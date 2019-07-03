package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Random;
class j_49_02_basic_01 {
	public static void main (String args[]) {

	    Random number = new Random(123L);//not compliant
	    //...
	    for (int i = 0; i < 20; i++) {
	      // Generate another random integer in the range [0, 20]
	      int n = number.nextInt(21);
	      System.out.println(n);
	    }
	}
}
