package cn.net.cobot.cobot_benchmark_javacert;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class j_13_12_basic_good_1001 {
	public static void main(String[] args) {
		try {
			DataInputStream dis = null;
			try {
				dis = new DataInputStream(new FileInputStream("data"));
				byte[] buffer = new byte[4];
				int bytesRead = dis.read(buffer); // Bytes are read into buffer
				if (bytesRead != 4) {
					throw new IOException("Unexpected End of Stream");
				}
				int serialNumber = ByteBuffer.wrap(buffer).order(ByteOrder.LITTLE_ENDIAN).getInt();
			} finally {
				if (dis != null) {
					try {
						dis.close();
					} catch (IOException x) {
						// Handle error
					}
				}
			}
		} catch (IOException x) {
			// Handle error
		}
	}
}