package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

//Double-checked locking idiom
final class j_09_10_basic_01 {
	private Helper33 helper = null;

	public Helper33 func_09_10_basic_01_bad() {
		if (helper == null) {
			synchronized (this) {          //not compliant
				if (helper == null) {
					helper = new Helper33();
				}
			}
		}
		return helper;
	}

	// Other methods and members...
}
class Helper33{}
