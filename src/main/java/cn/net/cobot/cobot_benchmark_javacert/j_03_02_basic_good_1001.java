package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.util.Collection;
import java.util.Iterator;

public class j_03_02_basic_good_1001 {

    public void test1() {
        long num1 = 0;
        long num2 = 0;
        long result = 0;
        if (num2 == 0) {
            // Handle error
        } else {
            result = num1 / num2;
        }
    }

    public void test2() {
        long num1 = 0;
        long num2 = 0;
        long result = 0;
        if (num2 ==2) {
            // Handle error
        } else if (num2 == 1){
            result = num1 % num2;
        } else {

        }
    }

    public void test3() {
        int z = 0;
        if (unknown()) {
            // ..
            z = 3;
        } else {
            // ..
            z = 1;
        }
        z = 1 / z;
    }

    public boolean unknown() {
        return false;
    }
}
