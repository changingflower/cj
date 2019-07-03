package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public class j_05_01_basic_01 {
	public int total; //not compliant // Number of elements

	void add() {
		if (total < Integer.MAX_VALUE) {
			total++;
			// ...
		} else {
			throw new ArithmeticException("Overflow");
		}
	}

	void remove() {
		if (total > 0) {
			total--;
			// ...
		} else {
			throw new ArithmeticException("Overflow");
		}
	}
}
