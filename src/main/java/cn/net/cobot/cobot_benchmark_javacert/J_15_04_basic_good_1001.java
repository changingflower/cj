package cn.net.cobot.cobot_benchmark_javacert;
import java.security.Permission;


public class J_15_04_basic_good_1001 {
	SecurityManager sm = System.getSecurityManager();
	public void check(){
	if (sm != null) {  // Check whether file may be read
	  DTDPermission perm = new DTDPermission("/local/",  "readDTD");
	  sm.checkPermission(perm);
	}
	}
}
class DTDPermission extends Permission{
	public DTDPermission(String a, String b)
	{
		super(a);
	}

	@Override
	public boolean implies(Permission permission) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getActions() {
		// TODO Auto-generated method stub
		return null;
	}
}