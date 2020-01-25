package concurrency.threads;

public class RunnableExampleMain2 {

    public static void main(String[] args) {
        System.out.println("Executing program...");

        // Create a new instance of our class that implements the Runnable interface.
        // This class can be provided as an argument to a Thread instance.
        RunnableExample2 r = new RunnableExample2();

        // Create a new Thread instance, provide the task that we want to run
        // (by providing the Runnable as an argument) and give the thread a name.
        // Now we can use Thread.start() to run it!
        Thread thread1 = new Thread(r, "Thread 1");
        thread1.start();

        // We are creating a second thread. Take notice that we are
        // providing the same Runnable, so this thread will run the same task
        // as the first one.
        Thread thread2 = new Thread(r, "Thread 2");
        thread2.start();

        // Create a thread and provide the Runnable argument as an anonymous inner class.
        // Since we are creating the class "on the spot", we need to provide the implementation
        // of the run() method here.
        // This way is faster and more compact, but it lacks Reusability.
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                // We are doing the same thing as with the MyRunnableImplementation class
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() +
                        "\twith Runnable: Inner class Runnable runs..." + i);
                }
            }
        }, "Thread 3");

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

                // We are doing the same thing as with the MyRunnableImplementation class
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() +
                        "\twith Runnable: Inner class Runnable runs..." + i);
                }
            }
        }, "Thread 4");

        thread3.start();
        thread4.start();

    }


}
