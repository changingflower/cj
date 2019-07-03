package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.nio.CharBuffer;

final class j_13_05_basic_01 {

	private char[] dataArray;

	public j_13_05_basic_01() {
	    dataArray = new char[10];			//
	}

	public CharBuffer getBufferCopy() {
	    return CharBuffer.wrap(dataArray);		//not compliant
	}

}
