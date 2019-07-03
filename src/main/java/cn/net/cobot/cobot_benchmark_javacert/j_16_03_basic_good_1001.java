package cn.net.cobot.cobot_benchmark_javacert;
import java.security.CodeSource;
import java.security.PermissionCollection;

//check type:Java
public class j_16_03_basic_good_1001 extends parent{
	protected PermissionCollection getPermissions(CodeSource cs) {
		PermissionCollection pc = super.getPermissions(cs);
		// Other permissions
		return pc;
	}
}

class parent {
	protected PermissionCollection getPermissions(CodeSource cs) {
		return null;
	}
}