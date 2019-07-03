package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;

//check type:Java
class j_05_11_basic_02 {
	private static Stock s;//not compliant
	static {
		try {
			s = new Stock();
		} catch (Exception e) {
			/* Does not initialize s to a safe state */
		}
	}
	
}
class Stock{}
