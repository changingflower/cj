package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author:Chen
 * @Date:2017/12/12
 */
public class j_04_00_basic_01 {

    public final int MAX_SIZE = 1024;

    public String func_04_00_basic_01_bad(Socket socket) throws IOException {
      InputStream in = socket.getInputStream();
      byte[] data = new byte[MAX_SIZE+1];
      int offset = 0;
      int bytesRead = 0;
      String str = new String();
      while ((bytesRead = in.read(data, offset, data.length - offset)) != -1) {
        str += new String(data, offset, bytesRead, "UTF-8");          //not compliant
        offset += bytesRead;
        if (offset >= data.length) {
          throw new IOException("Too much input");
        }
      }
      in.close();
      return str;
    }
}
