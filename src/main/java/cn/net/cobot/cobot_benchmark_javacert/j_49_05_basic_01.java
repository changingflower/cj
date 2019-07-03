package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

class J_49_05_basic_01 {
	private Vector<String> names = new Vector<String>();
	private final InputStreamReader input;
	private final BufferedReader reader;

	public J_49_05_basic_01(String filename) throws IOException {
		this.input = new FileReader(filename);
		this.reader = new BufferedReader(input);
	}

	public void addNames() throws IOException {
		try {
			String newName;
			while (((newName = reader.readLine()) != null) && !(newName.equalsIgnoreCase("quit"))) {	//not compliant
				names.addElement(newName);
				System.out.println("adding " + newName);
			}
		} finally {
			input.close();
		}
	}

	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("Arguments: [filename]");
			return;
		}
		J_49_05_basic_01 demo = new J_49_05_basic_01(args[0]);
		demo.addNames();
	}
}