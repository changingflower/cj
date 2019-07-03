package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.File;
public class j_02_00_basic_good_1001 {

  public static void main2(String[] args) {
    File someFile = new File("someFileName.txt");
	  // Do something with someFile
	 if (!someFile.delete()) {

   }
  }

  public static void test2() {
    String original = "insecure";
    String newString = original.replace('i', '9');
    System.out.println(newString);
  }

  public void test3() {
    StringBuilder sb = new StringBuilder();
    sb.append("___").append("aaa").append("str".replace("oldChar", ""));
  }
}