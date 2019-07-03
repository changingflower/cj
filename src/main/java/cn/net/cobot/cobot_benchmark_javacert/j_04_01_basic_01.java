package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
public class j_04_01_basic_01 {

  public static String func_04_01_basic_01_bad(String string) {
    char ch;
    int i;
    for (i = 0; i < string.length(); i += 1) {
      ch = string.charAt(i);           //not compliant
      if (!Character.isLetter(ch)) {
        break;
      }
    }
    return string.substring(i);
  }
}
