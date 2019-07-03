package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_13_04_basic_01 {
	public int processFile(String fileName) throws IOException, FileNotFoundException {
		FileInputStream stream = new FileInputStream(fileName);		//not compliant
		BufferedReader bufRead = new BufferedReader(new InputStreamReader(stream));
		String line;
		while ((line = bufRead.readLine()) != null) {
			sendLine(line);
		}
		return 1;
	}

	private void sendLine(String line) {
		// TODO Auto-generated method stub
		System.out.println("line has been send");
	}
}