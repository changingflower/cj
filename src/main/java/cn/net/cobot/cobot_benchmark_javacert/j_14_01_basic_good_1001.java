package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class j_14_01_basic_good_1001 implements Serializable {
	  private final long serialVersionUID = 123456789;
	  private j_14_01_basic_good_1001() {
	    // Initialize
	  }
	  private void writeObject(final ObjectOutputStream stream)
			    throws IOException {
		  stream.defaultWriteObject();
	  }

	  private void readObject(final ObjectInputStream stream)
			    throws IOException, ClassNotFoundException {
		  stream.defaultReadObject();
	  }
}
