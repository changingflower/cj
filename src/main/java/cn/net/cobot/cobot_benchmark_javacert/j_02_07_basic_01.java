package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

public class j_02_07_basic_01 {

	public void copy(String[] a, String[] b, String ending) {
		int index;
		String temp = null;
		System.out.println(temp.length());
		int length = a.length;
		for (index = 0; index < a.length; index++) {
			if (true) {
				if (temp == ending) // not compliant
				{
					break;
				}
				b[index] = temp;
			}
		}
	}
}
