package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.AccessDeniedException;

public final class j_14_04_basic_01 implements Serializable {
	  // Private internal state
	  private String town;
	  private static final String UNKNOWN = "UNKNOWN";
	 
	  void performSecurityManagerCheck() throws AccessDeniedException {
	    // ...
	  }
	 
	  void validateInput(String newCC) throws Exception {
	    // ...
	  }
	 
	  public j_14_04_basic_01() throws AccessDeniedException {
	    performSecurityManagerCheck();
	 
	    // Initialize town to default value
	    town = UNKNOWN;
	  }
	 
	  // Allows callers to retrieve internal state
	  String getValue() throws AccessDeniedException {
	    performSecurityManagerCheck();
	    return town;
	  }
	 
	  // Allows callers to modify (private) internal state
	  public void changeTown(String newTown) throws Exception {
	    if (town.equals(newTown)) {
	      // No change
	      return;
	    } else { 
	      performSecurityManagerCheck();
	      validateInput(newTown);
	      town = newTown;
	    }
	  }
	 
	  private void writeObject(ObjectOutputStream out) throws IOException {
	    out.writeObject(town);
	  }
	 
	  private void readObject(ObjectInputStream in) throws Exception {
	    in.defaultReadObject();
	    // If the deserialized name does not match the default value normally
	    // created at construction time, duplicate the checks
	    if (!UNKNOWN.equals(town)) {
	      validateInput(town);
	    }
	  }
	}