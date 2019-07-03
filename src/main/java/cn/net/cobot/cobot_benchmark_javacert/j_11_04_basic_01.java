package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

//check type:java

enum Day1 {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
 
class Diary1 {
  private static final ThreadLocal<Day1> days =
      new ThreadLocal<Day1>() {
    // Initialize to Monday
    protected Day1 initialValue() {
      return Day1.MONDAY;
    }
  };
 
  private static Day1 currentDay() {
    return days.get();
  }
 
  public static void setDay(Day1 newDay) {
    days.set(newDay);
  }
 
  // Performs some thread-specific task
  public void threadSpecificTask() {
    // Do task ...
  }
}
 
public final class j_11_04_basic_01 {
  final int numOfThreads = 2; // Maximum number of threads allowed in pool
  final Executor exec;
  final Diary1 Diary1;
 
  j_11_04_basic_01() {
    exec = (Executor) Executors.newFixedThreadPool(numOfThreads);
    Diary1 = new Diary1();
  }
 
  public void doSomething1() {
    exec.execute(new Runnable() {
        @Override public void run() {
          Diary1.setDay(Day1.FRIDAY);   //not compliant
          Diary1.threadSpecificTask();
        }
    });
  }
 
  public void doSomething2() {
    exec.execute(new Runnable() {
        @Override public void run() {
          Diary1.threadSpecificTask();
       }
    });
  }
 
  public static void main(String[] args) {
	j_11_04_basic_01 dp = new j_11_04_basic_01();
    dp.doSomething1(); // Thread 1, requires current day as Friday
    dp.doSomething2(); // Thread 2, requires current day as Monday
    dp.doSomething2(); // Thread 3, requires current day as Monday
  }
}