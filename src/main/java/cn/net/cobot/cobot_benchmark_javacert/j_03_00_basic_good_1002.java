package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 


public class j_03_00_basic_good_1002 {

	public static long intRangeCheck(long value) {
		  if ((value < Integer.MIN_VALUE) || (value > Integer.MAX_VALUE)) {
		    throw new ArithmeticException("Integer overflow");
		  }
		  return value;
		}
		 
		public static int multAccum(int oldAcc, int newVal, int scale) {
		  final long res = intRangeCheck(
		   ((long) oldAcc) + intRangeCheck((long) newVal * (long) scale)
		  );
		  return (int) res; // Safe downcast
		}
}
