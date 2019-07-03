package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class j_14_01_basic_01 implements Serializable {				//
	  private final long serialVersionUID = 123456789;
	  private j_14_01_basic_01() {

	  }
	  public static void writeObject(final ObjectOutputStream stream)		//not compliant
	    throws IOException {
	    stream.defaultWriteObject();
	  }
	  public static void readObject(final ObjectInputStream stream)			//not compliant
	      throws IOException, ClassNotFoundException {
	    stream.defaultReadObject();
	  }
}
