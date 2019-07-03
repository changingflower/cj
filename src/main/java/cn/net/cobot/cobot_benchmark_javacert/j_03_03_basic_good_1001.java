package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class j_03_03_basic_good_1001 {
    // public static void main(String[] args) {
    //     byte[] arr = {-1,-1,-1,-1};// 某些系统会有unsigned int  0xffffffff
    //     ByteArrayInputStream bais = new ByteArrayInputStream (arr);
    //     DataInputStream dis = new DataInputStream(bais);
    //     getInteger(is);// 能正确显示
    // }
    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt()&0xFFFFFFFFL;
    }
}
