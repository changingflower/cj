package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.*;

class j_14_12_basic_01 {
  public static Object deserialize(byte[] buffer) throws IOException, ClassNotFoundException {
    Object ret = null;
    try (ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {
      try (ObjectInputStream ois = new ObjectInputStream(bais)) {
        ret = ois.readObject();		//not compliant
      }
    }
    return ret;
  }
}
