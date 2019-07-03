package cn.net.cobot.cobot_benchmark_javacert;
public class J_15_05_basic_02 {
	J_15_05_basic_02() {	//not compliant
	} // Package-private constructor

	public static <T> T create(Class<T> c) throws InstantiationException, IllegalAccessException {
		return c.newInstance();
	}
}
