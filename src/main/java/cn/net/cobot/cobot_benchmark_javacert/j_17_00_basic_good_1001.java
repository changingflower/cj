package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
public final class j_17_00_basic_good_1001 {

	// Private native method
	private native void nativeOperation(byte[] data, int offset, int len);
	public void securityManagerCheck(){}
	// Wrapper method performs SecurityManager and input validation checks
	public void doOperation(byte[] data, int offset, int len) {
		// Permission needed to invoke native method
		securityManagerCheck();

		if (data == null) {
			throw new NullPointerException();
		}

		// Copy mutable input
		data = data.clone();

		// Validate input
		if ((offset < 0) || (len < 0) || (offset > (data.length - len))) {
			throw new IllegalArgumentException();
		}

		nativeOperation(data, offset, len);
	}
	
	static {
		// Load native library in static initializer of class
		System.loadLibrary("NativeMethodLib");
	}
}
