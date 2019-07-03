package cn.net.cobot.cobot_benchmark_javacert;
import junit.framework.Assert;

//check type:Java
public class j_02_00_basic_01 {
	
  public static void test1() {
    String original = "insecure";
    original.replace('i', '9');// not compliant
    System.out.println(original);
    original = original.replaceAll("[\\p{Cn}]", "");

  }

  private void assertEqualsIgnoreSpaces(String expected, String fixed) {
	  Assert.assertEquals(expected.replaceAll("\\s+", ""), fixed.replaceAll("\\s+", ""));
  }
}