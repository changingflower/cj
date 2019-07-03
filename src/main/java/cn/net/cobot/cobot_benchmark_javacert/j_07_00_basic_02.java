package cn.net.cobot.cobot_benchmark_javacert;
import java.io.*;
import java.io.*;

//check type:Java
class j_07_00_basic_02 implements Runnable {
  public void run() {
	  File file = new File("");
	  InputStream is = null;
      OutputStream os = null;
      try {
          is = new BufferedInputStream(new FileInputStream(file));
          os = new ByteArrayOutputStream();
          copy(is,os);
          is.close();
          os.close();
      } catch (IOException e) {
          e.printStackTrace();
      } 
      finally { //not compliant
      }
  }
 public void copy(InputStream is,OutputStream os){}
}
