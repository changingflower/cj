package cn.net.cobot.cobot_benchmark_javacert;
import java.lang.reflect.ReflectPermission;
import java.security.CodeSource;
import java.security.PermissionCollection;

//check type:Java
public class j_16_03_basic_01 extends parent{
	protected PermissionCollection getPermissions(CodeSource cs) {
		PermissionCollection pc = super.getPermissions(cs);
		pc.add(new ReflectPermission("suppressAccessChecks"));   //not compliant // Permission to create a class loader
		// Other permissions
		pc.add(new RuntimePermission("createClassLoader"));		//not compliant
		return pc;
	}
}
