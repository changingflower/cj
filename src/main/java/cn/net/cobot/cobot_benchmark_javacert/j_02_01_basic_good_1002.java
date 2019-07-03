package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Collection;
import java.util.Iterator;

public class j_02_01_basic_good_1002 {
    
    public int test4(String s) {
        return s == null ? 0 : s.length();
    }
    
    public void test5() {
    	String s = null;
   		test4(s);
    }
    

}
