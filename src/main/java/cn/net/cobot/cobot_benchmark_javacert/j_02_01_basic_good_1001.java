package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Collection;
import java.util.Iterator;

public class j_02_01_basic_good_1001 {
    public void test0(Integer a) {
        if (a != null) {
            a.byteValue();
        }
        String s = "";
        int length = s.length();
    }

    public void test1(Object obj, final Collection<?> col) {
        if (obj == null) {
            return;
        }
        // 可疑
        if (obj.equals("col")) {
            System.out.println("equals");
        }
    }

    public boolean test2(String s) {
        String[] names = s.split(" ");
        if (names.length != 2) {
            return true;
        }
        return false;
    }
    
    public boolean testString(String s) {
        if (s == null) return false;
        else return test2(s);
    }
    
    public boolean test3(String s) {
    	if (s == null)
    		return false;
        String[] names = s.split(" ");
        if (names.length != 2) {
            return true;
        }
        return false;
    }
    
    public void test4(String s) {
        String[] names= s.split(" ");
        if (names.length != 2) {
            System.out.println("!=2");
        }
    }
    
    public void test5() {
    	String s = null;
    	if (s != null)
    		test4(s);
    }
    

}
