package pool.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorExample2 {

    public static Executor executor = Executors.newSingleThreadExecutor();


    public static Runnable testing() {

        Runnable runnableTask = () -> {

            System.out.println("Running time consuming tasks");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Return from the non-daemon thread");
            System.out.println(Thread.currentThread().isDaemon());
            return;
        };

        return runnableTask;
    }

    public static void main(String[] args) {
        System.out.println("Hello Executing the main thread");

        executor.execute(ExecutorExample2.testing());

        System.out.println("After completing the time consuming task");

        System.out.println(Thread.currentThread().getName());
        System.out.println("\n");
        System.out.println(Thread.getAllStackTraces());



    }

}
