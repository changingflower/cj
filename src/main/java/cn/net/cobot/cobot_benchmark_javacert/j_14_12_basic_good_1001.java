package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.*;
import java.util.*;

class j_14_12_basic_good_1001_1 extends ObjectInputStream {
	  public Set whitelist;

	  public j_14_12_basic_good_1001_1(InputStream inputStream, Set wl) throws IOException {
	    super(inputStream);
	    whitelist = wl;
	  }

	  @Override
	  protected Class<?> resolveClass(ObjectStreamClass cls) throws IOException, ClassNotFoundException {
	    if (!whitelist.contains(cls.getName())) {
	      throw new InvalidClassException("Unexpected serialized class", cls.getName());
	    }
	    return super.resolveClass(cls);
	  }
}

class j_14_12_basic_good_1001 {
	  private static Object deserialize(byte[] buffer) throws IOException, ClassNotFoundException {
	    Object ret = null;
	    Set whitelist = new HashSet<String>(Arrays.asList(new String[]{"GoodClass1","GoodClass2"}));
	    try (ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {
	      try (j_14_12_basic_good_1001_1 ois = new j_14_12_basic_good_1001_1(bais, whitelist)) {
	        ret = ois.readObject();
	      }
	    }
	    return ret;
	  }
}
