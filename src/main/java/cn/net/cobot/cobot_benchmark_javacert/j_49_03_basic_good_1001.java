package cn.net.cobot.cobot_benchmark_javacert;
import java.io.*;
import java.util.Arrays;

//check type:Java
class j_49_03_basic_good_1001 {
  public static void main(String[] args) throws IOException {
    char[] ipAddress = new char[100];
    int offset = 0;
    int charsRead = 0;
    BufferedReader br = null;
    try {
      br = new BufferedReader(new InputStreamReader(
             new FileInputStream("serveripaddress.txt")));
      while ((charsRead = br.read(ipAddress, offset, ipAddress.length - offset))
          != -1) {
        offset += charsRead;
        if (offset >= ipAddress.length) {
          break;
        }
      }

      // ... Work with IP address

    } finally {
     // Arrays.fill(ipAddress,  (byte) 0);
      br.close();
    }
  }
}
