package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.lang.reflect.Field;

public class cobot_50_00_basic_07 {
	
	public void func() throws NoSuchFieldException, SecurityException{
		@SuppressWarnings("rawtypes")
		Class cls = (Class) new Object();
		@SuppressWarnings("unused")
		Field field = cls.getField("main");	//not compliant
	}
	
}
