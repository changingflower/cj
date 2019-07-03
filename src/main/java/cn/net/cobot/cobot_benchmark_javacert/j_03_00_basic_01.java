package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
public class j_03_00_basic_01 {

	public static int multAccum(int oldAcc, int newVal, int scale) {
		  // May result in overflow
		  return oldAcc + (newVal * scale);  //not compliant
		}
}
