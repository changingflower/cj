package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Employee2 {
  private String name;
  private double salary;
  private final long employeeID; // Unique for each Employee

  Employee2(String name, double salary, long empID) {
    this.name = name;
    this.salary = salary;
    this.employeeID = empID;
  }

  // ...

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Employee2)) {
      return false;
    }

    Employee2 emp = (Employee2) o;
    return emp.employeeID == employeeID;
  }  
}

public class j_06_11_basic_good_1001 {
  public static void main(String[] args) {
    System.out.println("hello world");
  //Client code remains same
  	Map<Employee2, Calendar> map = new ConcurrentHashMap<Employee2, Calendar>();
  	//...
  }
}
