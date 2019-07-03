package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_07_02_basic_01{
	public void j_07_02_basic_01() {
		try {
			int a=1;
		}catch(SecurityException se){
			System.err.println(se);//not compliant
		}
	}
}
