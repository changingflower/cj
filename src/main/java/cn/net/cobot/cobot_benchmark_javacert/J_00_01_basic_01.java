package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.util.regex.*;
import java.text.Normalizer;
import java.text.Normalizer.Form;
class J_00_01_basic_01 {
  public void method1() {
    // String s may be user controllable
    // \uFE64 is normalized to < and \uFE65 is normalized to > using the NFKC
    // normalization form
    String s = "\uFE64" + "script" + "\uFE65";
    // Validate
    Pattern pattern = Pattern.compile("[<>]"); // Check for angle brackets
    Matcher matcher = pattern.matcher(s);
    if (matcher.find()) {
      // Found black listed tag
      throw new IllegalStateException();
    } else {
      // ...
    }
    // Normalize
    s = Normalizer.normalize(s, Form.NFKC);
  }

}



