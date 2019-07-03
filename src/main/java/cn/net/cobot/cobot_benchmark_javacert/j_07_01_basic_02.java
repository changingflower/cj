package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class j_07_01_basic_02 {
	
  public static void main(String[] args)throws Exception {
	  try {
		  FileInputStream fis =
		      new FileInputStream(System.getenv("APPDATA") + args[0]);
	  } catch (FileNotFoundException e) {	//not compliant
		  // Log the exception
		  throw new IOException("Unable to retrieve file", e);
	  }
  }
  
}
