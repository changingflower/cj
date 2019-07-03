package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_07_07_basic_01{

	boolean isCapitalized(String s) {
	  if (s == null) {
	    throw new RuntimeException("Null String");//not compliant
	  }
	  if (s.equals("")) {
	    return true;
	  }
	  String first = s.substring(0, 1);
	  String rest = s.substring(1);
	  return (first.equals(first.toUpperCase()) &&
	          rest.equals(rest.toLowerCase()));
	}
}
