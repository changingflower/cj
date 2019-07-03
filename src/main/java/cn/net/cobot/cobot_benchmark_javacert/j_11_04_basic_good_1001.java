package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

//check type:java

enum Day2 {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
 
class Diary2 {
  private static final ThreadLocal<Day2> days =
      new ThreadLocal<Day2>() {
    // Initialize to Monday
    protected Day2 initialValue() {
      return Day2.MONDAY;
    }
  };
 
  private static Day2 currentDay() {
    return days.get();
  }
 
  public static void setDay(Day2 newDay) {
    days.set(newDay);
  }
 
  // Performs some thread-specific task
  public void threadSpecificTask() {
    // Do task ...
  }
}
 
public final class j_11_04_basic_good_1001 {
  final int numOfThreads = 2; // Maximum number of threads allowed in pool
   Executor exec;
   Diary2 Diary2;
 
  public void DiaryPool() {
    exec = (Executor) Executors.newFixedThreadPool(numOfThreads);
    Diary2 = new Diary2();
  }
 
 public void doSomething1() {
      exec.execute(new Runnable() {
        @Override public void run() {
          try {
            Diary2.setDay(Day2.FRIDAY);
            Diary2.threadSpecificTask();
          } finally {
        	  Diary2.setDay(Day2.MONDAY) ;// Diary2.setDay(Day.MONDAY)
                               // can also be used
          }
        }
    });
  }
 
  public void doSomething2() {
    exec.execute(new Runnable() {
        @Override public void run() {
          Diary2.threadSpecificTask();
       }
    });
  }
 
  public static void main(String[] args) {
	j_11_04_basic_good_1001 dp = new j_11_04_basic_good_1001();
    dp.doSomething1(); // Thread 1, requires current day as Friday
    dp.doSomething2(); // Thread 2, requires current day as Monday
    dp.doSomething2(); // Thread 3, requires current day as Monday
  }
}