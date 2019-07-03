package cn.net.cobot.cobot_benchmark_javacert;
import java.util.concurrent.atomic.AtomicInteger;

//check type:java 
public class j_03_00_basic_02 {
	class InventoryManager {
		  private final AtomicInteger itemsInInventory = new AtomicInteger(100);
		 
		  //...
		  public final void nextItem() {
		    itemsInInventory.getAndIncrement();    //not compliant
		  }
		}
}
