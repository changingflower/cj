package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.util.Date;
import java.util.ArrayList;
/**
 * @author:Chen
 * @Date:2017/11/30
 */
public class j_06_01_basic_01 {
    public static void main(String[] args) {
        System.out.println(fun());
        boolean flag=1>2;  
        assert true;  
    }

    public static int func_06_01_basic_01_bad(int x, int y) {
        assert x != Integer.MIN_VALUE;         //not compliant
        assert y != Integer.MAX_VALUE;         //not compliant
        int absX = Math.abs(x);
        int absY = Math.abs(y);
       // assert (absX <= Integer.MAX_VALUE - absY);     
        return absX + absY;
    }

    public static int fun() {
        boolean flag = 3 > 2;
        assert flag;
        return 1;
    }
}
