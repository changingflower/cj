package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class j_00_16_basic_02 {
  private static void createXMLStreamBad(final BufferedOutputStream outStream,
      final String quantity) throws IOException {
    outStream.write(quantity.getBytes());  //not compliant
    outStream.flush();
  }
  
public static void main(String[] args) throws Exception {   
	createXMLStreamBad(new BufferedOutputStream(new FileOutputStream("bos.txt")),args[1]);
}
	  
}
