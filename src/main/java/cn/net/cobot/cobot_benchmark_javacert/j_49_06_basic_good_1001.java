package cn.net.cobot.cobot_benchmark_javacert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//check type:Java
class j_49_06_basic_good_1001 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");

    Iterator iter = list.iterator();
    while (iter.hasNext()) {
      String s = (String)iter.next();
      if (s.equals("one")) {
    	  iter.remove();
      }
    }
  }
}
