package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class j_14_11_basic_01 implements Externalizable {

	private String name;
	private int UID;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

	}

	@Override
	public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {

		int a = 1;
		name = (String) in.readObject();		//not compliant
		this.UID = in.readInt();			    //not compliant
		a = 0;

	}
}
