package miniproject0.edu.coursera.concurrent;

public class HelloRunnable implements Runnable {

    private Integer value;

    public HelloRunnable( Integer value){
        this.value = value;
    }
    /**
     * Provide a Runnable object. The Runnable interface defines a single method, run,
     * meant to contain the code executed in the thread.
     * The Runnable object is passed to the Thread constructor, as in the HelloRunnable example:
     */
    @Override
    public void run() {
        System.out.println("First statement with value = " + this.value);
        System.out.println("Second statement with value = " + this.value);
    }

    public static void main(String args[]) {

        for(int i=0; i<10; i++) {
            new Thread(new HelloRunnable(i)).start();
        }
    }
}
