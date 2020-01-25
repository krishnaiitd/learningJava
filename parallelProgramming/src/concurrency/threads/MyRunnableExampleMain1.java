package concurrency.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyRunnableExampleMain1 {

	public static void main(String[] args) {

		long start = new Date().getTime();
        // We will store the threads so that we can check if they are done
		List<Thread> threads = new ArrayList<Thread>();
		
		// We will create 500 threads
        for (int i = 0; i < 500; i++) {
            Runnable runnableTask = new MyRunnableExample1(10000000L + i);
            Thread worker = new Thread(runnableTask);
            // We can set the name of the thread
            worker.setName("threadNo-" + String.valueOf(i));
            // Start the thread, never call method run() direct
            worker.start();
            // Remember the thread for later usage
            threads.add(worker);
        }
        
        int running;
        do {
	        	running = 0;
	        	for(Thread thread : threads) {
	        		if (thread.isAlive()) {
	        			running++;
//	        			System.out.println("Current Alive Thread name: " + thread.getName());
	        		}
	        	}
	        
//	        	System.out.println("We have " + running + " running threads. ");

        } while (running > 0);

        long end = new Date().getTime();

		System.out.println("Total time consumed is ms " + (end - start));

	}
}
