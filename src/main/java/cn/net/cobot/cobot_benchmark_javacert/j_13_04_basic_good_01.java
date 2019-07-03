package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_13_04_basic_good_01 {
	public static void main(String[] args) {
		try {
			String fileName = "file.txt";
			final FileInputStream stream = new FileInputStream(fileName);	//ok
			try {
				final BufferedReader bufRead = new BufferedReader(new InputStreamReader(stream));

				String line;
				while ((line = bufRead.readLine()) != null) {
					sendLine(line);
				}
			} finally {
				if (stream != null) {
					try {
						stream.close();		//ok
					} catch (IOException e) {
						// Forward to handler
					}
				}
			}
		} catch (IOException e) {
			// Forward to handler
		}
	}

	private static void sendLine(String line) {
		// TODO Auto-generated method stub
		System.out.println("Line has been send");
	}
}