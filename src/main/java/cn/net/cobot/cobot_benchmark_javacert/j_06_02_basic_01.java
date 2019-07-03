package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.util.Date;
import java.util.ArrayList;

/**
 * @author:Chen
 * @Date:2017/11/30
 */
public class j_06_02_basic_01 {
  public static void func_06_02_basic_01_bad1(String[] args) {
    Character.isJavaLetter('a');               //not compliant
    Character.isJavaLetterOrDigit('a');              //not compliant
    Date a = new Date();
    a.getDate();		              //not compliant
    j_06_02_basic_01.func_06_02_basic_01_bad2();    //not compliant
  }

  @Deprecated
  public static void func_06_02_basic_01_bad2() {                    
    System.out.println("ggg");
  }
}
