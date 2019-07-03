package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

class j_13_03_basic_good_01 {
  public static void main(String[] args) {
    Path tempFile = null;
    try {
      tempFile = Files.createTempFile("tempnam", ".tmp");		//ok
      try (BufferedWriter writer =
          Files.newBufferedWriter(tempFile, Charset.forName("UTF8"),
                                  StandardOpenOption.DELETE_ON_CLOSE)) {
        // Write to file
      }
      System.out.println("Temporary file write done, file erased");
    } catch (FileAlreadyExistsException x) {
      System.err.println("File exists: " + tempFile);
    } catch (IOException x) {
      // Some other sort of failure, such as permissions.
      System.err.println("Error creating temporary file: " + x);
    }
  }
}