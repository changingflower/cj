package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public final class j_17_00_basic_01 {

	// Public native method
	public native void nativeOperation(byte[] data, int offset, int len);//not compliant

	// Wrapper method that lacks security checks and input validation
	public void doOperation(byte[] data, int offset, int len) {
		nativeOperation(data, offset, len);
	}

	static {
		// Load native library in static initializer of class
		System.loadLibrary("NativeMethodLib");
	}
}
