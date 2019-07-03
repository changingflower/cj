package cn.net.cobot.cobot_benchmark_javacert;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//check type:Java

final class j_08_03_basic_02 {
  private final List<InetAddress> ips =
      Collections.synchronizedList(new ArrayList<InetAddress>());
 
  public void addAndPrintIPAddresses(InetAddress address) {	//not compliant
    ips.add(address);
    InetAddress[] addressCopy =
        (InetAddress[]) ips.toArray(new InetAddress[0]);
    // Iterate through array addressCopy ...
  }
}

class MyRunnable19 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread19 extends Thread {
    
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
