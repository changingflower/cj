package cn.net.cobot.cobot_benchmark_javacert;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

//check type:Java
class j_13_10_basic_02 {

	public static String readBytes(InputStream in) throws IOException {
	  byte[] data = new byte[1024];
	  int offset = 0;
	  if (in.read(data, offset, data.length - offset) != -1) {	//not compliant
	    throw new EOFException();
	  }
	  return new String(data, "UTF-8");
	}
	
}
