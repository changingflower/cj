package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
final class j_09_10_basic_good_1005 {
	private final ThreadLocal<j_09_10_basic_good_1005> perThreadInstance = new ThreadLocal<j_09_10_basic_good_1005>();
	private Helper38 helper = null;

	public Helper38 getHelper() {
		if (perThreadInstance.get() == null) {
			createHelper();
		}
		return helper;
	}

	private synchronized void createHelper() {
		if (helper == null) {
			helper = new Helper38();
		}
		// Any non-null value can be used as an argument to set()
		perThreadInstance.set(this);
	}
}
class Helper38{}
