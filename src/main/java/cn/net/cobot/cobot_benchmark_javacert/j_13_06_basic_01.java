package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;

public final class j_13_06_basic_01 {
  public static char getChar() throws EOFException, IOException {
    BufferedInputStream in = new BufferedInputStream(System.in); 		//not compliant;Wrapper
    int input = in.read();
    if (input == -1) {
      throw new EOFException();
    }
    // Down casting is permitted because InputStream guarantees read() in range
    // 0..255 if it is not -1
    return (char) input;
  }

  public static void main(String[] args) {
    try {
      // Either redirect input from the console or use
      // System.setIn(new FileInputStream("input.dat"));
      System.out.print("Enter first initial: ");
      char first = getChar();
      System.out.println("Your first initial is " + first);
      System.out.print("Enter last initial: ");
      char last = getChar();
      System.out.println("Your last initial is " + last);
    } catch (EOFException e) {
      System.err.println("ERROR");
      // Forward to handler
    } catch (IOException e) {
      System.err.println("ERROR");
      // Forward to handler
    }
  }
}
