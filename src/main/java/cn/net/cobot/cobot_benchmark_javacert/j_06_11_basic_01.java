package cn.net.cobot.cobot_benchmark_javacert;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//check type:java
// Mutable class Employee
class Employee {
  private String name;
  private double salary;
  Map<Employee, Calendar> map = new HashMap<>();
  Employee(String empName, double empSalary) {
    this.name = empName;
    this.salary = empSalary;
  }

  public void setEmployeeName(String empName) {
    this.name = empName;
  }

  public void setSalary(double empSalary) {
    this.salary = empSalary;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Employee)) {
      return false;
    }

    Employee emp = (Employee) o;
    return emp.name.equals(name);      //not compliant
  }

}

public class j_06_11_basic_01 {
  public static void main(String[] args) {
    System.out.println("hello world");
    //Client code remains same
   	Map<Employee, Calendar> map = new ConcurrentHashMap<Employee, Calendar>();
   	//...
  }
}
