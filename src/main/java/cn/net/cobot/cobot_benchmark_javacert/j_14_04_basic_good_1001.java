package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.AccessDeniedException;

public final class j_14_04_basic_good_1001 implements Serializable {

	  private String town;
	  private static final String UNKNOWN = "UNKNOWN";

	  void performSecurityManagerCheck() throws AccessDeniedException {

	  }

	  void validateInput(String newCC) throws Exception {

	  }

	  public j_14_04_basic_good_1001() throws AccessDeniedException {
	    performSecurityManagerCheck();

	    town = UNKNOWN;
	  }

	  String getValue() throws AccessDeniedException {
	    performSecurityManagerCheck();
	    return town;
	  }


	  public void changeTown(String newTown) throws Exception {
	    if (town.equals(newTown)) {

	      return;
	    } else {
	      performSecurityManagerCheck();
	      validateInput(newTown);
	      town = newTown;
	    }
	  }

	  private void writeObject(ObjectOutputStream out) throws IOException {
		    performSecurityManagerCheck();
		    out.writeObject(town);
	  }

	  private void readObject(ObjectInputStream in) throws Exception {
		    in.defaultReadObject();

		    if (!UNKNOWN.equals(town)) {
		      performSecurityManagerCheck();
		      validateInput(town);
		    }
	  }

}
