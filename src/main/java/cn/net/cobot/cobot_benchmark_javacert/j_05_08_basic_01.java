package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
class j_05_08_basic_01 {
	private int x;
	private int y;

	public class Point {
		public void getPoint() {
			System.out.println("(" + x + "," + y + ")");//not compliant //not compliant
		}
	}
}
