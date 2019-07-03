package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java

public final class j_06_08_basic_01 {
  private String s;
 
  public j_06_08_basic_01(String s) {
    if (s == null) {
      throw new NullPointerException();
    }
    this.s = s;
  }
 
  // This method violates symmetry
  public boolean equals(Object o) {	//not compliant
    if (o instanceof j_06_08_basic_01) {
      return s.equalsIgnoreCase(((j_06_08_basic_01)o).s);
    }
 
    if (o instanceof String) {
      return s.equalsIgnoreCase((String)o);
    }
    return false;
  }
 
  // Comply with MET09-J
  public int hashCode() {/* ... */return 1;}
 
  public static void main(String[] args) {
    j_06_08_basic_01 cis = new j_06_08_basic_01("Java");
    String s = "java";
    System.out.println(cis.equals(s)); // Returns true
    System.out.println(s.equals(cis)); // Returns false
  }
}