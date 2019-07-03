package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public class cobot_50_02_basic_03 {

	public static final String PREFS_NAME = "process";
	
	public static void main(String[] args) {
		Context mContext = new Context();
		mContext.getSharedPreferences(PREFS_NAME, 0);	//not compliant
	}
}

class Context {
	public void getSharedPreferences(String a, int b) {
		
	}
}
