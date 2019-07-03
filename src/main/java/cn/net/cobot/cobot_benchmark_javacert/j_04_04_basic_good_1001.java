package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author:Chen
 * @Date:2017/12/12
 */
public class j_04_04_basic_good_1001 {
    public static void func_04_04_basic_01_good(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("SomeFile");
            DataInputStream dis = new DataInputStream(fis);
            byte[] data = new byte[1024];
            dis.readFully(data);
            String result = new String(data, "UTF-16LE");
        } catch (IOException x) {
            // Handle error
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException x) {
                    // Forward to handler
                }
            }
        }
    }
}
