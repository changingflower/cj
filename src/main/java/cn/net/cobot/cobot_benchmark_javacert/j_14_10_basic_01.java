package cn.net.cobot.cobot_benchmark_javacert;
import java.io.*;

//check type:Java
 
class j_14_10_basic_01 {
  public static void main(String[] args) throws IOException {
    ObjectOutputStream out = null;
    try {
      out = new ObjectOutputStream(
          new BufferedOutputStream(new FileOutputStream("ser.dat")));
      while (SensorData.isAvailable()) {
        // Note that each SensorData object is 1 MB in size
        SensorData sd = SensorData.readSensorData();
        out.writeObject(sd);    // not compliant
      }
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }
}
