package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.nio.CharBuffer;

final class j_13_05_basic_good_1003 {
	CharBuffer cb;

	public j_13_05_basic_good_1003() {
		cb = CharBuffer.allocate(10);
		// Initialize
	}

	public CharBuffer getBufferCopy() {
		return cb.asReadOnlyBuffer();
	}
}
