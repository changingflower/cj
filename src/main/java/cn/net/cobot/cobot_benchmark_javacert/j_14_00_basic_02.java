package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;

class j_14_00_basic_02_1 implements Serializable { //not compliant
	  int numOfWeapons = 10; // Total number of weapons
	}

public class j_14_00_basic_02 implements Serializable {
	  j_14_00_basic_02_1 ws = new j_14_00_basic_02_1();
	  private static final ObjectStreamField[] serialPersistentFields
	      = {new ObjectStreamField("ws", j_14_00_basic_02_1.class)};

	  private void readObject(ObjectInputStream ois)
	      throws IOException, ClassNotFoundException {
	    ObjectInputStream.GetField gf = ois.readFields();
	    this.ws = (j_14_00_basic_02_1) gf.get("ws", ws);
	  }

	  private void writeObject(ObjectOutputStream oos) throws IOException {
	    ObjectOutputStream.PutField pf = oos.putFields();
	    pf.put("ws", ws);
	    oos.writeFields();
	  }

	  public String toString() {
	    return String.valueOf(ws);
	  }

}
