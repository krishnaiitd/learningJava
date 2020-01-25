package concurrency.threads;

public class RunnableExample2 implements Runnable {

    // We are creating anew class that implements the Runnable interface,
    // so we need to override and implement it's only method, run().
    @Override
    public void run() {
        // We are creating a simple loop which will run and allow us to take
        // a look into how the different threads run.
        for (int i = 0; i < 5; i++) {

            // Thread.currentThread().getName() is used to get the name of the
            // currently running thread. We can provide a name, if we create
            // the thread ourselves, else it will be given one from the JVM.
            System.out.println(Thread.currentThread().getName() +
                "\twith Runnable: MyRunnableImplementation runs..." + i);
        }
    }
}
