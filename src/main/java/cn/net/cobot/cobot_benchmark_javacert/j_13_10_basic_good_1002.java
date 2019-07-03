package cn.net.cobot.cobot_benchmark_javacert;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//check type:Java
class j_13_10_basic_good_1002 {

	public static String readBytes(FileInputStream fis)
            throws IOException {
		byte[] data = new byte[1024];
		DataInputStream dis = new DataInputStream(fis);
		dis.readFully(data);
		String str = new String(data, "UTF-8");
		return str;
	}
	
}
