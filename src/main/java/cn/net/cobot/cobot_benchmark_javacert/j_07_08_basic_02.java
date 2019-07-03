package cn.net.cobot.cobot_benchmark_javacert;
import java.io.FileWriter;
import java.io.IOException;

//check type:Java
public interface j_07_08_basic_02 {
  void write(String messageToLog);
}

class j_07_08_basic_021 implements j_07_08_basic_02 {
	
  private final FileWriter out;

  public j_07_08_basic_021(){
	  out = null;
  }
  
  public j_07_08_basic_021(String logFileName) throws IOException {
    out = new FileWriter(logFileName, true);
  }

  public void write(String messageToLog) {
    // Write message to file
  }
}

class j_07_08_basic_022 implements j_07_08_basic_02 {
  public void write(String messageToLog) {
    System.out.println(messageToLog); // Write message to console
  }
}

class j_07_08_basic_023 {
  private j_07_08_basic_02 log;

  j_07_08_basic_023() {
    this.log = null; // No logger
  }

  j_07_08_basic_023(j_07_08_basic_02 log) {
    this.log = log; // Set the specified logger
  }

  public void handle() {
    try {
      log.write("Request received and handled");
    } catch (NullPointerException npe) {//not compliant
      // Ignore
    }
  }

  public static void main(String[] args) throws IOException {
    j_07_08_basic_023 s = new j_07_08_basic_023(new j_07_08_basic_021("logfile.log"));
    s.handle();

    s = new j_07_08_basic_023(new j_07_08_basic_021());
    s.handle();
  }
}
