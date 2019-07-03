package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.io.*;

public class j_04_02_basic_02 {
  private static String inputFile = "PrintMyself.java";
  private static String outputFile = "PrintMyself.txt";

  public static void func_04_02_basic_02_bad(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(inputFile));       //not compliant
    PrintWriter writer = new PrintWriter(new FileWriter(outputFile));			 //not compliant
    int line = 0;
    while (reader.ready()) {
      line++;
      writer.println(line + ": " + reader.readLine());
    }
    reader.close();
    writer.close();
  }
}
