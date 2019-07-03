package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
import java.util.concurrent.locks.*;

class j_10_03_basic_02 {
  final Lock lock = new ReentrantLock();
  final Condition notFull  = lock.newCondition();
  final Condition notEmpty = lock.newCondition();

  final Object[] items = new Object[100];
  int putptr, takeptr, count;

  public void put(Object x) throws InterruptedException {
    lock.lock();
    try {
      if (count == items.length)
        notFull.await();                              //not compliant
      items[putptr] = x;
      if (++putptr == items.length) putptr = 0;
      ++count;
      notEmpty.signal();
    } finally {
      lock.unlock();
    }
  }

  public Object take() throws InterruptedException {
    lock.lock();
    try {
      if (count == 0)
        notEmpty.await();                                  //not compliant
      Object x = items[takeptr];
      if (++takeptr == items.length) takeptr = 0;
      --count;
      notFull.signal();
      return x;
    } finally {
      lock.unlock();
    }
  }
}
