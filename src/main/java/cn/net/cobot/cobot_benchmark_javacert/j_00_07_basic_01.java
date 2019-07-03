package cn.net.cobot.cobot_benchmark_javacert;
import java.io.InputStream;

//check type:java 

public class j_00_07_basic_01 {

	  public static void main(String[] args) throws Exception {
		    String dir = System.getProperty("dir");
		    Runtime rt = Runtime.getRuntime();
		    Process proc = rt.exec("cmd.exe /C dir " + dir); //not compliant
		    int result = proc.waitFor();
		    if (result != 0) {
		      System.out.println("process error: " + result);
		    }
		    InputStream in = (result == 0) ? proc.getInputStream() :
		                                     proc.getErrorStream();
		    int c;
		    while ((c = in.read()) != -1) {
		      System.out.print((char) c);
		    }
		  }

}
