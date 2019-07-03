package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Collection;
import java.util.Iterator;

public class j_02_01_basic_01 {
    
    // 为一定
    public void test0() {
        Integer a = null;
        a.byteValue();//not compliant
        String s = null;
        int length = s.length();//not compliant
    }
    
    //可疑
    public static int cardinality(Object obj, final Collection<?> col) {
      int count = 0;
      if (col == null) {
        return count;
      }
      Iterator<?> it = col.iterator();
      while (it.hasNext()) {
        Object elt = it.next();
        if ((null == obj && null == elt) || obj.equals(elt)) {
          count++;
        }
      }
      return count;
    }
    
}
