package cn.net.cobot.cobot_benchmark_javacert;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//check type:java
public class cobot_50_00_basic_06 {
	
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(new FileInputStream("test.txt"));
		int size = input.readInt();
		byte[] data = new byte[size];
		input.read(data);	//not compliant
		input.close();
	}
	
}