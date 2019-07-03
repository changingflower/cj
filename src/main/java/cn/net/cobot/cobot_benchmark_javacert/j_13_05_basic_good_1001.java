package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.nio.CharBuffer;

final class j_13_05_basic_good_1001 {

	private char[] dataArray;

	public j_13_05_basic_good_1001() {
	    dataArray = new char[10];
	    // Initialize
	}

	public CharBuffer getBufferCopy() {
	    return CharBuffer.wrap(dataArray).asReadOnlyBuffer();
	}

}
