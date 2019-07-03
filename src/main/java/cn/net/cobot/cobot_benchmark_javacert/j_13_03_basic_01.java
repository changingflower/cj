package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class j_13_03_basic_01 {
  public static void main(String[] args) throws IOException{
    File f = new File("tempnam.tmp");	//not compliant
    if (f.exists()) {
      System.out.println("This file already exists");
      return;
    }
 
    FileOutputStream fop = null;
    try {
      fop = new FileOutputStream(f);
      String str = "Data";
      fop.write(str.getBytes());
    } finally {
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