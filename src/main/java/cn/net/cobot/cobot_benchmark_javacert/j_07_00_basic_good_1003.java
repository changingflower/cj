package cn.net.cobot.cobot_benchmark_javacert;
import java.util.logging.Level;
import java.util.logging.Logger;

//check type:Java
class j_07_00_basic_good_1003 extends ExceptionReporter {
  private static final Logger logger =
      Logger.getLogger("com.organization.Log");

  public static void report(Throwable t) {
    t = filter(t);
    if (t != null) {
      logger.log(Level.FINEST, "Loggable exception occurred", t);
    }
  }

  public static Throwable filter(Throwable t) {
    if (t instanceof SensitiveException1) {
      // Too sensitive, return nothing (so that no logging happens)
      return null;
    } else if (t instanceof SensitiveException2) {
      // Return a default insensitive exception instead
      return new FilteredSensitiveException(t);
    }
    // ...
    // Return for reporting to the user
    return t;
  }
}
class ExceptionReporter{}

class SensitiveException1 extends Throwable{}
class SensitiveException2 extends Throwable{}
class FilteredSensitiveException extends Exception{
	
	FilteredSensitiveException(Throwable t){}
}
// ...Definitions for SensitiveException1, SensitiveException2
// and FilteredSensitiveException...
