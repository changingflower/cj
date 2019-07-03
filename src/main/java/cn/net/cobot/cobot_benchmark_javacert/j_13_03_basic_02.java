package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class j_13_03_basic_02 {
  public static void main(String[] args) throws IOException{
    File f = File.createTempFile("tempnam",".tmp");		//not compliant
    FileOutputStream fop = null;
    try {
      fop = new FileOutputStream(f);
      String str = "Data";
      fop.write(str.getBytes());
      fop.flush();
    } finally {
      // Stream/file still open; file will
      // not be deleted on Windows systems
      f.deleteOnExit(); // Delete the file when the JVM terminates
 
      if (fop != null) {
        try {
          fop.close();	
        } catch (IOException x) {
          // Handle error
        }
      }
    }
  }
}