package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_05_09_basic_02{
	j_05_09_basic_02 x;
	j_05_09_basic_02 y;
	public  boolean is() {
	
		if (x.getClass().getName().equals(y.getClass().getName())) {    //not compliant
		   return true;
		}
		return false;
	}
	
}

