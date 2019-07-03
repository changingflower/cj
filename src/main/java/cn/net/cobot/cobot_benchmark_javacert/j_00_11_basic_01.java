package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
  
public class j_00_11_basic_01 {
  public static String filterString(String str) {
    String s = Normalizer.normalize(str, Form.NFKC);
 
    // Validate input
    Pattern pattern = Pattern.compile("<script>");
    Matcher matcher = pattern.matcher(s);
    if (matcher.find()) {
      throw new IllegalArgumentException("Invalid input");
    }
    
    s = s.replaceAll("[\\p{Cn}]", "");
    // Deletes noncharacter code points
    return s;
  }
 
  public static void main(String[] args) {
    // "\uFDEF" is a noncharacter code point
    String maliciousInput = "<scr" + "\uFDEF" + "ipt>";
    String sb = filterString(maliciousInput);
    // sb = "<script>"
  }
}
