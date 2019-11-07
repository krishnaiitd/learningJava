package pool.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.text.AbstractDocument.ElementEdit;

public class ExecutorExample1 {
    private ExecutorService executor1  = Executors.newFixedThreadPool(1);


    public static void main(String[] args) {
        ExecutorExample1 executorExample1 = new ExecutorExample1();
        executorExample1.test();
        System.out.println("khatam ho gya..............");
    }
    public void test() {
//        ExecutorService executor  = Executors.newSingleThreadExecutor();
//        executor.execute(() -> System.out.println("Single thread pool test 1"));
//        executor.execute(() -> System.out.println("Single thread pool test 2"));
//        executor.execute(() -> System.out.println("Single thread pool test 3"));
//        executor.execute(() -> System.out.println("Single thread pool test 4"));
//        System.out.println("Finished all the single jobs");
//        executor.shutdown(); // Shutdown and program exited


        // How to shutdown only the Executor as below:
//        ((ExecutorService) executor1).submit()
//        executor1.execute(() -> System.out.println("Single thread pool test 2"));
//        executor1.execute(() -> System.out.println("Single thread pool test 3"));
//        executor1.execute(() -> System.out.println("Single thread pool test 4"));
        executor1.submit(() -> {
            System.out.println(Thread.currentThread().getName());
      });
        System.out.println("Finished all the single jobs");
        executor1.shutdown();
        // Program is never exited

    }

}
