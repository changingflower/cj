package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_05_11_basic_good_1002 {
	private static  Stock1 s = null;
	static {
		try {
			s = new Stock1();
		} catch (Exception e) {
			/* Does not initialize s to a safe state */
		}
	}
}
class Stock1{}