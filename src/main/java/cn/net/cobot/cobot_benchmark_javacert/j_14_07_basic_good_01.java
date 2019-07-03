package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.*;
class NumberDataGood extends Number {
  // ... Implement abstract Number methods, like Number.doubleValue()...
 
  private static final NumberDataGood INSTANCE = new NumberDataGood ();
  public static NumberDataGood getInstance() {
    return INSTANCE;
  }
 
  private NumberDataGood() {
    // Perform security checks and parameter validation
  }
 
  protected int printData() {
    int data = 1000;
    // Print data
    return data;
  }
  
  protected final Object readResolve() throws NotSerializableException {
	    return INSTANCE;
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
 
class j_14_07_basic_good_01 {
  public static void main(String[] args) {
    NumberDataGood sc = (NumberDataGood) deepCopy(NumberDataGood.getInstance());
    // Prints false; indicates new instance
    System.out.println(sc == NumberDataGood.getInstance()); 
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