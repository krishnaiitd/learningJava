package pool.threads;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

public class CallerRunsPolicyDemo {

  class DemoThread implements Runnable {

    final private long i;

    public DemoThread(long i) {
      this.i = i;
    }

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName());
//      System.out.println("Hello World " + i);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {

//     Pool 1 : LinkedBlockingDeque
    ThreadPoolExecutor pool1 = new ThreadPoolExecutor(5, 15,
        500, TimeUnit.MILLISECONDS,
        new LinkedBlockingDeque<Runnable>(2), new CallerRunsPolicy());

    // Pool 2 : SynchronousQueue
    ThreadPoolExecutor pool2 = new ThreadPoolExecutor(5, 15,
        500, TimeUnit.MILLISECONDS,
        new SynchronousQueue<>(), new CallerRunsPolicy()

//        Custom caller Runs Policy
//        new RejectedExecutionHandler() {
//      @Override
//      public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//        System.out.println("In the case of rejectedExecution");
//        executor.execute(r);
//      }
//    }

    );

//    ExecutorService pool3 = Executors.newFixedThreadPool(10);
//    ExecutorService pool4 = Executors.newCachedThreadPool();

    long start = new Date().getTime();
    for (int i = 0; i < 100; i++) {
      Runnable th = new CallerRunsPolicyDemo().new DemoThread(i);
      pool2.execute(th);
    }
    pool1.shutdown();
    pool2.shutdown();
    long end = new Date().getTime();
    System.out.println("Time taken by pool 1 in ms " + (end - start));

//    start = new Date().getTime();
//    for (int i = 0; i < 10; i++) {
//      Runnable th = new CallerRunsPolicyDemo().new DemoThread(i);
//      pool2.execute(th);
//    }
//    pool2.shutdown();
//    end = new Date().getTime();
//    System.out.println("Time taken by pool 2 in ms " + (end - start));
//    start = new Date().getTime();
//    for (int i = 0; i < 10; i++) {
//      Runnable th = new CallerRunsPolicyDemo().new DemoThread(i);
//      pool3.execute(th);
//    }
//    pool3.shutdown();
//
//    end = new Date().getTime();
//    System.out.println("Time taken by pool 3 in ms " + (end - start));
//    start = new Date().getTime();
//    for (int i = 0; i < 10; i++) {
//      Runnable th = new CallerRunsPolicyDemo().new DemoThread(i);
//      pool4.execute(th);
//    }
//    end = new Date().getTime();
//    System.out.println("Time taken by pool 4 in ms " + (end - start));
//    pool4.shutdown();

  }
}
