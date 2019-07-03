package cn.net.cobot.cobot_benchmark_javacert;
import java.io.RandomAccessFile;
import java.security.AccessController;
import java.security.PrivilegedAction;

class cobot_15_02_basic_01 {
	public RandomAccessFile openFile(final java.io.File f) {
		askUserPermission(f.getPath());		// not compliant
		// ...
		return (RandomAccessFile) AccessController.doPrivileged(new PrivilegedAction<Object>() {
			public Object run() {
				try{
				return new RandomAccessFile(f, f.getPath());
				}catch(Exception e){return null;}
			}
		});
	}

	private void askUserPermission(String path) {
		// TODO Auto-generated method stub
		//do something
	}
}