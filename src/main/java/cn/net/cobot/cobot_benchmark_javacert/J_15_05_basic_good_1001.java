package cn.net.cobot.cobot_benchmark_javacert;

public class J_15_05_basic_good_1001 {
	private int i = 3;
	private int j = 4;

	public String toString() {
		return "FieldExample: i=" + i + ", j=" + j;
	}

	public void zeroI() {
		this.i = 0;
	}

	private void zeroField(String fieldName) {
	    // ...
	}

	public static void main(String[] args) {
		FieldExample fe = new FieldExample();
		System.out.println(fe.toString());
		for (String arg : args) {
			fe.zeroField(arg);
			System.out.println(fe.toString());
		}
	}
}
