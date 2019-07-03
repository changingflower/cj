package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
class SuperClass1 {
  public SuperClass1 () {
    doLogic();
  }
 
  public void doLogic() {
    System.out.println("This is superclass!");
  }
}
 
class SubClass1 extends SuperClass1 {
  private String color = null;
  public SubClass1() {
    super();
    color = "Red";
  }
 
  public final void doLogic() {
    System.out.println("This is subclass! The color is :" + color);
    // ...
  }
}
 
public class j_06_05_basic_good_1001 {
  public static void main(String[] args) {
    SuperClass bc = new SuperClass();
    // Prints "This is superclass!"
    SuperClass sc = new SubClass();
    // Prints "This is subclass! The color is :null"
  }
}