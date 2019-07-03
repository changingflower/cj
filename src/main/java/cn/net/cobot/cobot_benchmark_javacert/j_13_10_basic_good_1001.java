package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.io.InputStream;

//check type:Java
class j_13_10_basic_good_1001 {

	public static String readBytes(InputStream in) throws IOException {
	  int offset = 0;
	  int bytesRead = 0;
	  byte[] data = new byte[1024];
	  while ((bytesRead = in.read(data, offset, data.length - offset))
	    != -1) {
	    offset += bytesRead;
	    if (offset >= data.length) {
	      break;
	    }
	  }
	  String str = new String(data, 0, offset, "UTF-8");
	  return str;
	}
	
}
