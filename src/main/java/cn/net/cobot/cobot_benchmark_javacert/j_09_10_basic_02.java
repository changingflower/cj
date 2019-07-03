package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public final class j_09_10_basic_02 {
	private final int n;

	public j_09_10_basic_02(int n) {
		this.n = n;
	}

	// Other fields and methods, all fields are final
}

final class Foo {
	private j_09_10_basic_02 helper = null;

	public j_09_10_basic_02 func_09_10_basic_02_bad() {
		if (helper == null) { // First read of helper
			synchronized (this) {                  //not compliant
				if (helper == null) { // Second read of helper
					helper = new j_09_10_basic_02(42);
				}
			}
		}
		return helper; // Third read of helper
	}
}
