package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class j_14_11_basic_good_1001 implements Externalizable {

	private String name;
	private int UID;
	private final Object lock = new Object();
	private boolean initialized = false;


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// ...
	}

	@Override
	public void readExternal(ObjectInput in)
	                         throws IOException, ClassNotFoundException {
//	  synchronized (lock) {
	    if (!initialized) {
	      // Read instance fields
	      this.name = (String) in.readObject();
	      this.UID = in.readInt();
	      // ...
	      initialized = true;
	    } else {
	      throw new IllegalStateException();
//	    }
	  }
	}
}
