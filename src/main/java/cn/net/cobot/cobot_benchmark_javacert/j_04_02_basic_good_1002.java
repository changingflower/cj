package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.io.*;
import java.nio.charset.Charset;

/**
 * @author:Chen
 * @Date:2017/12/12
 */
public class j_04_02_basic_good_1002 {
  private static String inputFile = "PrintMyself.java";
  private static String outputFile = "PrintMyself.txt";

  public static void main(String[] args) throws IOException {
    Charset encoding = Charset.forName("UTF8");
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), encoding));
    PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(outputFile), encoding));
    int line = 0;
    while (reader.ready()) {
      line++;
      writer.println(line + ": " + reader.readLine());
    }
    reader.close();
    writer.close();
  }
}
