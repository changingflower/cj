package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.ObjectInput;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PermissionCollection;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;

public class j_14_08_basic_good_1001 {

	private static class CalendarAccessControlContext {
		  private static final AccessControlContext INSTANCE;
		  static {
		      RuntimePermission perm =
		          new RuntimePermission("accessClassInPackage.sun.util.calendar");
		      PermissionCollection perms = perm.newPermissionCollection();
		      perms.add(perm);
		      INSTANCE = new AccessControlContext(new ProtectionDomain[] {
		          new ProtectionDomain(null, perms)
		      });
		  }
	}

	public void main(){
		ZoneInfo zi = null;
		ZoneInfo zone;
		final ObjectInput input = null;
		// ...
		try {
			zi = AccessController.doPrivileged(
				new PrivilegedExceptionAction<ZoneInfo>() {
				   public ZoneInfo run() throws Exception {
				        return (ZoneInfo) input.readObject();
				  }
				}, CalendarAccessControlContext.INSTANCE);
		} catch (PrivilegedActionException pae) { /* ... */ }
		if (zi != null) {
			zone = zi;
		}
	}
}
