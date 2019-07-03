package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_07_07_basic_good_1001{
	boolean j_07_07_basic_good_1001(String s) {
	  if (s == null) {
	    throw new NullPointerException();
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