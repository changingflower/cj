package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_07_08_basic_good_1003{
    boolean isName(String s) /* Throws NullPointerException */ {
        String names[] = s.split(" ");
        if (names.length != 2) {
            return false;
        }
        return (isCapitalized(names[0]) && isCapitalized(names[1]));
    }
	public boolean  isCapitalized(String str)
	{
		return true;
		
	}
}
