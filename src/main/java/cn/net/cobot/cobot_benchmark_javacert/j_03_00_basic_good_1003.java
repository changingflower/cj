package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.atomic.AtomicInteger;

//check type:java 

class j_03_00_basic_good_1003 {
  private final AtomicInteger itemsInInventory =
      new AtomicInteger(100);
 
  public final void nextItem() {
    while (true) {
      int old = itemsInInventory.get();
      if (old == Integer.MAX_VALUE) {
        throw new ArithmeticException("Integer overflow");
      }
      int next = old + 1; // Increment
      if (itemsInInventory.compareAndSet(old, next)) {
        break;
      }
    } // End while
  } // End nextItem()
}