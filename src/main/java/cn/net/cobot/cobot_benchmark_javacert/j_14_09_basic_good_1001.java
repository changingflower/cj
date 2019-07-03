package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class j_14_09_basic_good_1001 implements Serializable {
	private void readObject(final ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
		stream.defaultReadObject();
	}

	public void overridableMethod() {
		// ...
	}
}
