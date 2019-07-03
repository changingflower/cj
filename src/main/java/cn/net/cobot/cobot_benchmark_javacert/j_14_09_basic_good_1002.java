package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class j_14_09_basic_good_1002 implements Serializable {
	private void readObject(final ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
		overridableMethod();
		stream.defaultReadObject();
	}

	private void overridableMethod() {
		// ...
	}
}
