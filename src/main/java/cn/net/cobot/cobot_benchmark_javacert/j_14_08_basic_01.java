package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.ObjectInput;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;

public class j_14_08_basic_01 {
	public void main(){
		ZoneInfo zone;
		final ObjectInput input = null;
		try {
		  ZoneInfo zi = (ZoneInfo) AccessController.doPrivileged(	//
		    new PrivilegedExceptionAction() {
		      public Object run() throws Exception {
		        return input.readObject();							//not compliant
		      }
		  });
		  if (zi != null) {
		    zone = zi;
		  }
		} catch (Exception e)
		{
		  // Handle error
		}
	}
}

class ZoneInfo {
	
}
