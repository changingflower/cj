package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.UnknownHostException;

public class j_07_01_basic_good_1002 {
	
	public static void main(String[] args) {
	    FileInputStream fis = null;
	    try {
	      switch(Integer.valueOf(args[0])) {
	        case 1:
	          fis = new FileInputStream("c:\\homepath\\file1");
	          break;
	        case 2:
	          fis = new FileInputStream("c:\\homepath\\file2");
	          break;
	        //...
	        default:
	          System.out.println("Invalid option");
	          break;
	      }     
	    } catch (Throwable t) {
	      MyExceptionReporter.report(t); // Sanitize
	    }
	  }
  
}
class MyExceptionReporter{
	public static void report(Throwable t){}

	public static Exception handle(SecurityException e) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Exception handle(UnknownHostException e) {
		// TODO Auto-generated method stub
		return null;
	}
}