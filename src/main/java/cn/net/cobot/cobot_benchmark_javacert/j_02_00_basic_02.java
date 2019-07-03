package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.File;
public class j_02_00_basic_02 {
	
  public static void main(String[] args) {
    File someFile = new File("someFileName.txt");
	  // Do something with someFile
	  someFile.delete();// not compliant
	  boolean flag = someFile.delete();
  }

}