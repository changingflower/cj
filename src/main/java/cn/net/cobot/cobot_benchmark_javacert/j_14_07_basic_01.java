package cn.net.cobot.cobot_benchmark_javacert;
import java.io.*;

//check type:Java
class NumberData extends Number {
  // ... Implement abstract Number methods, like Number.doubleValue()...
 
  private static final NumberData INSTANCE = new NumberData ();
  public static NumberData getInstance() {
    return INSTANCE;
  }
 
  private NumberData() {
    // Perform security checks and parameter validation
  }
 
  protected int printData() {
    int data = 1000;
    // Print data
    return data;
  }

@Override
public int intValue() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public long longValue() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public float floatValue() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double doubleValue() {
	// TODO Auto-generated method stub
	return 0;
}
}
 
public class j_14_07_basic_01 {
  public static void main(String[] args) {
    NumberData sc = (NumberData) deepCopy(NumberData.getInstance());
    // Prints false; indicates new instance
    System.out.println(sc == NumberData.getInstance()); 
    System.out.println("Balance = " + sc.printData());
  }
 
  // This method should not be used in production code
  public static Object deepCopy(Object obj) {
    try {
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      new ObjectOutputStream(bos).writeObject(obj);
      ByteArrayInputStream bin =
          new ByteArrayInputStream(bos.toByteArray());
      return new ObjectInputStream(bin).readObject();     //not compliant
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}