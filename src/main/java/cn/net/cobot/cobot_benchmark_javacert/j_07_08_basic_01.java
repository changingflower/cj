package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_07_08_basic_01{
	boolean isName(String s) {
		  try {
		    String names[] = s.split(" ");

		    if (names.length != 2) {
		      return false;
		    }
		    return (isCapitalized(names[0]) && isCapitalized(names[1]));
		  } catch (NullPointerException e) {//not compliant
		    return false;
		  }
	}
	public boolean  isCapitalized(String str)
	{
		return true;
		
	}
}
