package cn.net.cobot.cobot_benchmark_javacert;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

//import cn.net.cobot.cobot_java_checker.rule.cobot_02_15.RetValue;


public class Cobot_02_16_01_basic_01 {
	public static class MixMatch {
		private void privilegedMethod() throws IOException {
			try {
				AccessController.doPrivileged(new PrivilegedExceptionAction<Void>() {
					public Void run() throws IOException, FileNotFoundException {
						final FileInputStream fis = new FileInputStream("file.txt");
						try {
							RetValue rt = new RetValue();

							if (rt.getValue() == 1) {		//not compliant
								// Do something with sensitive file
							}
						} finally {
							fis.close();
						}
						return null; // Nothing to return
					}
				});
			} catch (PrivilegedActionException e) {
				// Forward to handler and log
			}
		}

		public static void main(String[] args) throws IOException {
			MixMatch mm = new MixMatch();
			mm.privilegedMethod();
		}
	}
	
	
}
class RetValue {
	  public int getValue() {
	    return 1;
	  }
	}
