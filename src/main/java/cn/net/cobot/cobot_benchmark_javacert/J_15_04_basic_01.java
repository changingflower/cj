package cn.net.cobot.cobot_benchmark_javacert;
public class J_15_04_basic_01 {
	SecurityManager sm = System.getSecurityManager();
	{
		if (sm != null) {  // Check whether file may be read
		  sm.checkRead("/local/schema.dtd");	//not compliant
		}
	}
}
