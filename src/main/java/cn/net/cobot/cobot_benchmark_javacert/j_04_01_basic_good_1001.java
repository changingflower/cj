package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
public class j_04_01_basic_good_1001{
  public static String func_04_01_basic_01_good(String string) {
    int ch;
    int i;
    for (i = 0; i < string.length(); i += Character.charCount(ch)) {
      ch = string.codePointAt(i);
      if (!Character.isLetter(ch)) {
        break;
      }
    }
    return string.substring(i);
  }
}
