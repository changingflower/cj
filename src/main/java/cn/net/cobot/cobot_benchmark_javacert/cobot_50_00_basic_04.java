package cn.net.cobot.cobot_benchmark_javacert;
import java.io.File;
import java.net.URL;

//check type:java
public class cobot_50_00_basic_04{
	
	public static void main(String[] args) {
	    URL fileUrl = null;

	    File dir = new File(fileUrl.getFile());	//not compliant

	    //File dir = new File(fileUrl.toURI());
	}
	
}