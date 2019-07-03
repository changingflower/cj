package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class j_02_00_basic_good_1002 {
	
    public void copy(InputStream is, OutputStream os) throws IOException {
        int count = 0;
        byte[] buffer = new byte[1024];
        while ((count = is.read(buffer)) >= 0) {
            os.write(buffer, 0, count);
        }
       
    }

    public  void  readFile(File file) {
        InputStream is = null;
        OutputStream os = null;
            try {
                is = new BufferedInputStream(new FileInputStream(file));
                os = new ByteArrayOutputStream();
                copy(is,os);
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            } 
    }

}