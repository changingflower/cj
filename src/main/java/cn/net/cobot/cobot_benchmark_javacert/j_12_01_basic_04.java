package cn.net.cobot.cobot_benchmark_javacert;
import java.util.logging.Level;
import java.util.logging.Logger;

//check type:java
class DefaultExceptionReporter {
	class ExceptionReporter {
		public void setExceptionReporter(Object o) {
			
		}
	}
	public DefaultExceptionReporter(ExceptionReporter er) {
	    // Carry out initialization
		// Incorrectly publishes the "this" reference
		er.setExceptionReporter(this);    // not compliant
	}
 
  // Implementation of setExceptionReporter() and report()
}
// Class MyExceptionReporter derives from DefaultExceptionReporter
public class j_12_01_basic_04 extends DefaultExceptionReporter {
  private final Logger logger;
 
  public j_12_01_basic_04(ExceptionReporter er) {
    super(er); // Calls superclass's constructor
    // Obtain the default logger
    logger = Logger.getLogger("com.organization.Log");
  }
 
  public void report(Throwable t) {
    logger.log(Level.FINEST,"Loggable exception occurred", t);
  }
}

class MyRunnable implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}