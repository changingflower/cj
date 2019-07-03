package cn.net.cobot.cobot_benchmark_javacert;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class j_13_12_basic_01 {
	public static void main(String[] args) {
		try {
			DataInputStream dis = null;
			try {
				dis = new DataInputStream(new FileInputStream("data"));		//not compliant
				// Little-endian data might be read as big-endian
				int serialNumber = dis.readInt();
			} catch (IOException x) {
				// Handle error
			} finally {
				if (dis != null) {
					try {
						dis.close();
					} catch (IOException e) {
						//Handle error
					}
				}
			}
		} catch (Exception e) {
			// Forward to handler
		}
	}
}