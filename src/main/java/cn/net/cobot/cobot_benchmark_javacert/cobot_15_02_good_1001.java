package cn.net.cobot.cobot_benchmark_javacert;
import java.io.RandomAccessFile;
import java.security.AccessController;
import java.security.PrivilegedAction;

class cobot_15_02_good_01 {
	public RandomAccessFile openFile(final java.io.File f) {
		final java.io.File copy = new java.io.File(f.getPath());	//ok
		askUserPermission(copy.getPath());
		// ...
		return (RandomAccessFile) AccessController.doPrivileged(new PrivilegedAction<Object>() {
			public Object run() {
				try{
				return new RandomAccessFile(copy, copy.getPath());
				}catch(Exception e){return null;}
			}
		});
	}

	private void askUserPermission(String path) {
		// TODO Auto-generated method stub
		//do something
	}
}