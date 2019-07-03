package cn.net.cobot.cobot_benchmark_javacert;
import java.security.Key;

//check type:Java

class j_06_08_basic_04{
	
	private static boolean keysEqual(Key key1, Key key2) {
		  if (key1.equals(key2)) {	//not compliant
		    return true;
		  }
		  return false;
		}
	
}