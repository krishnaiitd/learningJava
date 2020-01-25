package pool.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.text.AbstractDocument.ElementEdit;

public class ExecutorServiceExample1 {

    private static ExecutorService executor1  = Executors.newFixedThreadPool(1);


    public static void main(String[] args) {
//        ExecutorExample1 executorExample1 = new ExecutorExample1();
//        executorExample1.test();
      test();

        System.out.println("khatam ho gya..............");
    }
    public static void test() {
//        ExecutorService executor  = Executors.newSingleThreadExecutor();
        for(int i = 1; i < 10; i++)
        {
          final int f = i;
          executor1.execute(() -> System.out.println("Single thread pool test " + f));

        }
        System.out.println("Finished all the single jobs");
//        executor1.shutdown(); // Shutdown and program exited


        // How to shutdown only the Executor as below:
//        ((ExecutorService) executor1).submit()
//        executor1.execute(() -> System.out.println("Single thread pool test 2"));
//        executor1.execute(() -> System.out.println("Single thread pool test 3"));
//        executor1.execute(() -> System.out.println("Single thread pool test 4"));
        executor1.submit(() -> {
            System.out.println("current thread name is : " + Thread.currentThread().getName());
            System.out.println("is Alive " + executor1.isTerminated());
      });
        System.out.println("Finished all the single jobs");
        executor1.shutdown();
        // Program is never exited if the above shutdown handler not called.

    }

}
