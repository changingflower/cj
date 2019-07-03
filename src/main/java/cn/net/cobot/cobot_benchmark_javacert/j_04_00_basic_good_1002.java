package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class j_04_00_basic_good_1002 {

	public final int MAX_SIZE = 1024;
	 
	public String readBytes(Socket socket) throws IOException {
	  InputStream in = socket.getInputStream();
	  InputStreamReader r = new InputStreamReader(in, "UTF-8");
	  char[] data = new char[MAX_SIZE+1];
	  int offset = 0;
	  int charsRead = 0;
	  String str = new String();
	  while ((charsRead = r.read(data, offset, data.length - offset)) != -1) {
	    str += new String(data, offset, charsRead);
	    offset += charsRead;
	    if (offset >= data.length) {
	      throw new IOException("Too much input");
	    }
	  }
	  in.close();
	  return str;
	}

}