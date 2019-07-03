package cn.net.cobot.cobot_benchmark_javacert;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

/* Assuming the heap size as 512 MB
 * (calculated as 1/4 of 2GB RAM = 512MB)
 * Considering long values being entered (64 bits each,
 * the max number of elements would be 512MB/64 bits =
 * 67108864)
 */
public class j_49_05_basic_02 {
	// Accepts unknown number of records
	Vector<Long> names = new Vector<Long>();
	long newID = 0L;
	int count = 67108865;	//10000000
	int i = 0;
	InputStreamReader input = new InputStreamReader(System.in);
	Scanner reader = new Scanner(input);

	public void addNames() {
		try {
			do {
				// Adding unknown number of records to a list
				// The user can enter more IDs than the heap can support and,
				// as a result, exhaust the heap. Assume that the record ID
				// is a 64-bit long value
				System.out.print("Enter recordID (To quit, enter -1): ");
				newID = reader.nextLong();

				names.addElement(newID);
				i++;
			} while (i < count || newID != -1);	//not compliant
		} finally {
			//input.close();
		}
	}

	public static void main(String[] args) {
		j_49_05_basic_02 demo = new j_49_05_basic_02();
		demo.addNames();
	}
}