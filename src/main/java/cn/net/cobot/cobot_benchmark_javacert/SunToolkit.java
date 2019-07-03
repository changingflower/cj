package cn.net.cobot.cobot_benchmark_javacert;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class SunToolkit {
	public static Field getField(final Class klass, final String fieldName) {
		return AccessController.doPrivileged(new PrivilegedAction<Field>() {
			public Field run() {
				try {
					Field field = klass.getDeclaredField(fieldName);
					assert (field != null);
					field.setAccessible(true);
					return field;
				} catch (SecurityException e) {
					assert false;
				} catch (NoSuchFieldException e) {
					assert false;
				}
				return null;
			}// run
		});
	}
}