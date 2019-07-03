package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

import java.util.regex.*;
import java.text.Normalizer;
import java.text.Normalizer.Form;
class J_00_01_basic_good_1001 {

  public void method2() {
    String s = "\uFE64" + "script" + "\uFE65";

    // Normalize
    s = Normalizer.normalize(s, Form.NFKC);
    // Validate
    Pattern pattern = Pattern.compile("[<>]");
    Matcher matcher = pattern.matcher(s);
    if (matcher.find()) {
      // Found blacklisted tag
      throw new IllegalStateException();
    } else {
      // ...
    }
  }
}



