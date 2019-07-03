package cn.net.cobot.cobot_benchmark_javacert;
import java.beans.Beans;
import java.io.IOException;

public class J_15_05_basic_good_1002  {

  public static <T> T create(Class<T> c)
      throws InstantiationException, IllegalAccessException {
     
    if (c.getConstructors().length == 0) {  // No public constructors
      SecurityManager sm = System.getSecurityManager();   
      if (sm != null) {
        // Throws an exception when access is not allowed         
        sm.checkPackageAccess("Safe");         
      }
    }
    return c.newInstance(); // Safe to return    
  } 
}