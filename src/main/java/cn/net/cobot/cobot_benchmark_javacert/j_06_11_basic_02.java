package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
// Mutable class Employee
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Employee3 {
	private String name;
	private double salary;
	private  long employeeID; // 
	Employee3(String empName, double empSalary, long empID) {
	  this.name = empName;
	  this.salary = empSalary;
	  this.employeeID = empID;
	}
  
	public void setEmployeeName(String empName) {
	  this.name = empName;
	}
  
	public void setSalary(double empSalary) {
	  this.salary = empSalary;
	}

	
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
  
	@Override
	public boolean equals(Object o) {
	  if (!(o instanceof Employee3)) {
		return false;
	  }
  
	  Employee3 emp = (Employee3) o;
	  return emp.employeeID == employeeID;     //not compliant
	}
  
  }



public class j_06_11_basic_02 {
	public static void main(String[] args) {
	  System.out.println("hello world");
	  //Client code remains same
		 Map<Employee3, Calendar> map = new ConcurrentHashMap<Employee3, Calendar>();
		 //...
	}
  }