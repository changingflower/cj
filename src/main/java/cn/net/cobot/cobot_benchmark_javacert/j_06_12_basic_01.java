package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import javax.swing.JFrame;

public class j_06_12_basic_01 extends JFrame {

	private byte[] buffer = new byte[16 * 1024 * 1024];  //not compliant
	private static final long serialVersionUID = 1L;
	public static void func_06_12_basic_01_bad() {
		System.gc();                      //not compliant
	    System.runFinalization();                    //not compliant
	    System.runFinalizersOnExit(true);                    //not compliant
	    Runtime.runFinalizersOnExit(true);                    //not compliant
	}
	public static void main(String[] args) {
	}
}
