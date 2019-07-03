package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;

class J_49_05_good_01 {
	private Vector<String> names = new Vector<String>();
	private final InputStreamReader input;
	private final BufferedReader reader;
	public static final int fileSizeLimit = 1000000;
	
	public J_49_05_good_01(String filename) throws IOException {
		long size = Files.size(Paths.get(filename));
		if (size > fileSizeLimit) {
			throw new IOException("File too large");
		} else if (size == 0L) {
			throw new IOException("File size cannot be determined, possibly too large");
		}
		this.input = new FileReader(filename);
		this.reader = new BufferedReader(input);
	}

	public static String readLimitedLine(Reader reader, int limit) throws IOException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < limit; i++) {
			int c = reader.read();
			if (c == -1) {
				return ((sb.length() > 0) ? sb.toString() : null);
			}
			if (((char) c == '\n') || ((char) c == '\r')) {
				break;
			}
			sb.append((char) c);
		}
		return sb.toString();
	}

	public static final int lineLengthLimit = 1024;
	public static final int lineCountLimit = 1000000;

	public void addNames() throws IOException {
		try {
			String newName;
			for (int i = 0; i < lineCountLimit; i++) {
				newName = readLimitedLine(reader, lineLengthLimit);
				if (newName == null || newName.equalsIgnoreCase("quit")) {
					break;
				}
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
		J_49_05_good_01 demo = new J_49_05_good_01(args[0]);
		demo.addNames();
	}
}