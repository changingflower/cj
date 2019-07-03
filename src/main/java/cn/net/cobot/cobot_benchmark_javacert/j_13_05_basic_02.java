package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.nio.CharBuffer;

final class j_13_05_basic_02 {
	CharBuffer cb;

	public j_13_05_basic_02() {
	    cb = CharBuffer.allocate(10);		//
	}

	public CharBuffer getBufferCopy() {
	    return cb.duplicate();				//not compliant
	}
}
