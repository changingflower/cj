package cn.net.cobot.cobot_benchmark_javacert;
import java.math.BigInteger;

//check type:java 
public class j_03_00_basic_good_1004 {
	private static final BigInteger bigMaxInt =
			  BigInteger.valueOf(Integer.MAX_VALUE);
	private static final BigInteger bigMinInt =   
			  BigInteger.valueOf(Integer.MIN_VALUE);
			 
	public static BigInteger intRangeCheck(BigInteger val) {
		if (val.compareTo(bigMaxInt) == 1 ||
			    val.compareTo(bigMinInt) == -1) {
			    throw new ArithmeticException("Integer overflow");
		}
			  return val;
	}
			 
	public static int multAccum(int oldAcc, int newVal, int scale) {
		BigInteger product =
			   BigInteger.valueOf(newVal).multiply(BigInteger.valueOf(scale));
		BigInteger res =
			   intRangeCheck(BigInteger.valueOf(oldAcc).add(product));
		return res.intValue(); // Safe conversion
	}
}
