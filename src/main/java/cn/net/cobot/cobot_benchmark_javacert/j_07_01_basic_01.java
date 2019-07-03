package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class j_07_01_basic_01 {
	
  public static void main(String[] args) throws FileNotFoundException {	//not compliant
    // Linux stores a user's home directory path in
    // the environment variable $HOME, Windows in %APPDATA%
    FileInputStream fis =
        new FileInputStream(System.getenv("APPDATA") + args[0]); 
  }
  
}