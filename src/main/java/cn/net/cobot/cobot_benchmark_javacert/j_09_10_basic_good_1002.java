package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

//Correct multithreaded version using synchronization
final class j_09_10_basic_good_1002 {
	private Helper35 helper = null;

	public synchronized Helper35 func_09_10_basic_02_good() {
		if (helper == null) {
			helper = new Helper35();
		}
		return helper;
	}
	// ...
}
class Helper35{}