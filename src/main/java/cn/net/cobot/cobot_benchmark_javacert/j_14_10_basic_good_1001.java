package cn.net.cobot.cobot_benchmark_javacert;
import java.io.*;

//check type:Java


class SensorData implements Serializable {
  // 1 MB of data per instance!
  //...
  public static SensorData readSensorData() {return new SensorData(); }
  public static boolean isAvailable() {return true;}
}
 
class j_14_10_basic_good_1001 {
  public static void main(String[] args) throws IOException {
    ObjectOutputStream out = null;
    try {
      out = new ObjectOutputStream(
          new BufferedOutputStream(new FileOutputStream("ser.dat")));
      while (SensorData.isAvailable()) {
        // Note that each SensorData object is 1 MB in size
        SensorData sd = SensorData.readSensorData();
        out.writeObject(sd);    
        out.reset();
      }
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }
}
