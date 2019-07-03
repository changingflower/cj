package cn.net.cobot.cobot_benchmark_javacert;
import java.lang.reflect.Field;

class FieldExample {
	private int i = 3;
	private int j = 4;

	public String toString() {
		return "FieldExample: i=" + i + ", j=" + j;
	}

	public void zeroI() {
		this.i = 0;
	}

	public void zeroField(String fieldName) {
		try {
			Field f = this.getClass().getDeclaredField(fieldName);		//not compliant
			// Subsequent access to field f passes language access checks
			// because zeroField() could have accessed the field via
			// ordinary field references
			f.setInt(this, 0);
			// Log appropriately or throw sanitized exception; see EXC06-J
		} catch (NoSuchFieldException ex) {
			// Report to handler
		} catch (IllegalAccessException ex) {
			// Report to handler
		}
	}

	public static void main(String[] args) {
		FieldExample fe = new FieldExample();
		System.out.println(fe.toString());
		for (String arg : args) {
			fe.zeroField(arg);
			System.out.println(fe.toString());
		}
	}
}