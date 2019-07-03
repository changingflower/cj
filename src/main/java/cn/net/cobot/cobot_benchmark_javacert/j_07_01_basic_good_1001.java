package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class j_07_01_basic_good_1001 {
	
	public static void main(String[] args) {
		 
	    File file = null;
	    try {
	      file = new File(System.getenv("APPDATA") +
	             args[0]).getCanonicalFile();
	      if (!file.getPath().startsWith("c:\\homepath")) {
	        System.out.println("Invalid file");
	        return;
	      }
	    } catch (IOException x) {
	      System.out.println("Invalid file");
	      return;
	    }
	 
	    try {
	      FileInputStream fis = new FileInputStream(file);
	    } catch (FileNotFoundException x) {
	      System.out.println("Invalid file");
	      return;
	    }
	  }
  
}