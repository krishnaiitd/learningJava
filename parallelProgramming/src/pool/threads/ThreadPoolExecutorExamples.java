package pool.threads;

import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExamples {

  public class DemoTask {

    final private long i;

    public DemoTask(long i) {
      this.i = i;
    }

    public void task() {
      System.out.println(Thread.currentThread().getName());
//      System.out.println("Hello World " + i);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }

  public class DemoTaskWithThread implements Runnable {

    final private long i;

    public DemoTaskWithThread(long i) {
      this.i = i;
    }

    public void task() {
      System.out.println(Thread.currentThread().getName());
//      System.out.println("Hello World " + i);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    @Override
    public void run() {
      task();
    }
  }

  public static void main(String[] args) {
//    // Calling the task without any thread i.e with the main thread
//    long start = new Date().getTime();
//    for (int i = 0; i < 100; i++) {
//      DemoTask demoTask = new ThreadPoolExecutorExamples().new DemoTask(i);
//      demoTask.task();
//    }
//    long end = new Date().getTime();
//    System.out.println("Total time in ms is :" + (end - start));

    long pool1Start = new Date().getTime();
    ThreadPoolExecutor pool1 = new ThreadPoolExecutor(5, 15,
        500,
        TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<>(75),
        new CallerRunsPolicy()
    );
    for (int i = 0; i < 100; i++) {
      DemoTaskWithThread demoThread = new ThreadPoolExecutorExamples().new DemoTaskWithThread(i);
      pool1.execute(demoThread);
    }
    pool1.shutdown();
    System.out.println("Completed with LinkedBlockingQueue in ms " + (new Date().getTime() - pool1Start));


    long startPool2 = new Date().getTime();
    ThreadPoolExecutor pool2 = new ThreadPoolExecutor(
        5,
        15,
        500,
        TimeUnit.MILLISECONDS,
        new SynchronousQueue<Runnable>(),
        new CallerRunsPolicy()
    );
    for(int i = 0; i < 100; i++) {
      DemoTaskWithThread demoThread = new ThreadPoolExecutorExamples().new DemoTaskWithThread(i);
      pool2.execute(demoThread);
    }
    pool2.shutdown();
    System.out.println("Completed with SynchronousQueue time in ms " + (new Date().getTime() - startPool2));
  }
}
