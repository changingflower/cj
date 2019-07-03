package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_05_09_basic_01{
	j_05_09_basic_01 auth;
	public boolean is() {
		if (auth.getClass().getName().equals(       //not compliant
				"com.application.auth.DefaultAuthenticationHandler")) {
		   return true;
		}
		return false;
	}
}
