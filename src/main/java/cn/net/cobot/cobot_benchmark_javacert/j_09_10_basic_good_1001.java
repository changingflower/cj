package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

//Correct single threaded version using lazy initialization
final class j_09_10_basic_good_1001 {
	private Helper34 helper = null;

	public Helper34 func_09_10_basic_01_good() {
		if (helper == null) {
			helper = new Helper34();
		}
		return helper;
	}
	// ...
}
class Helper34{}
