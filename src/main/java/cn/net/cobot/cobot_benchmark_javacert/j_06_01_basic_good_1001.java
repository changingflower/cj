package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.util.Date;
import java.util.ArrayList;
/**
 * @author:Chen
 * @Date:2017/11/30
 */
public class j_06_01_basic_good_1001 {
    public static int func_06_01_basic_01_good(int x, int y) {
  if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
    throw new IllegalArgumentException();
  }
  int absX = Math.abs(x);
  int absY = Math.abs(y);
  if (absX > Integer.MAX_VALUE - absY) {
    throw new IllegalArgumentException();
  }
  return absX + absY;
}
}
