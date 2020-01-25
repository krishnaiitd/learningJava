package pool.threads;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {


    public static void main(String[] args) {
        // Demo runnable task:
        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000l);
                System.out.println("Current time :: " + LocalDateTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        };

        //1.  ExecutorService instance : newSingleThreadExecutor
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 2. execute the task using execute method of executorService
        executorService.execute(runnableTask);
        // this method will closed for new task
//        executorService.shutdown();

        // 3. Execute the task using submit method
        Future<String> result = executorService.submit(runnableTask, "Donek");
        while(result.isDone() == false)
        {
            try
            {
                System.out.println("The method return value : " + result.get());
                break;
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }

            //Sleep for 1 second
            try {
                System.out.println("Sleep for 1000");
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Break from the other thread works and now at main thread");

//        executorService.shutdownNow();
        System.out.println(executorService.isTerminated());
        System.out.println(executorService.isShutdown());
        //Shut down the executor service, without below line, code will not exited.
        executorService.shutdown();

    }
}
