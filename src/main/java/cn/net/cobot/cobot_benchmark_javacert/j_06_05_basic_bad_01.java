package cn.net.cobot.cobot_benchmark_javacert;
//check type:java 
class SuperClass {
  public SuperClass () {
    doLogic();
  }
 
  public void doLogic() {
    System.out.println("This is superclass!");
  }
}
 
class SubClass extends SuperClass {
  private String color = null;
  public SubClass() {
    super();
    color = "Red";
  }
 
  public void doLogic() {
    System.out.println("This is subclass! The color is :" + color);
    // ...
  }
}
 
public class j_06_05_basic_bad_01 {
  public static void main(String[] args) {
    SuperClass bc = new SuperClass();
    // Prints "This is superclass!"
    SuperClass sc = new SubClass();
    // Prints "This is subclass! The color is :null"
  }
}