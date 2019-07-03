package cn.net.cobot.cobot_benchmark_javacert;
//check type:java

public final class j_09_10_basic_good_1007 {
	private final int n;

	public j_09_10_basic_good_1007(int n) {
		this.n = n;
	}

	// Other fields and methods, all fields are final
}

final class Foo_good7 {
	private j_09_10_basic_good_1007 helper = null;

	public j_09_10_basic_good_1007 func_09_10_basic_07_good() {
		j_09_10_basic_good_1007 h = helper; // Only unsynchronized read of helper
		if (h == null) {
			synchronized (this) {
				h = helper; // In synchronized block, so this is safe
				if (h == null) {
					h = new j_09_10_basic_good_1007(42);
					helper = h;
				}
			}
		}
		return h;
	}
}
