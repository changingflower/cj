package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

//Works with acquire/release semantics for volatile
//Broken under JDK 1.4 and earlier
final class j_09_10_basic_good_1003 {
	private volatile Helper36 helper = null;

	public Helper36 func_09_10_basic_03_good() {
		if (helper == null) {
			synchronized (this) {
				if (helper == null) {
					helper = new Helper36();
				}
			}
		}
		return helper;
	}
}
class Helper36{}
