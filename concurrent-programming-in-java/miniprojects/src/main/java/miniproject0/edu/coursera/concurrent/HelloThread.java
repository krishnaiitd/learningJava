package miniproject0.edu.coursera.concurrent;

/**
 * Subclass Thread. The Thread class itself implements Runnable, though its run method does nothing.
 * An application can subclass Thread, providing its own implementation of run
 */
public class HelloThread extends Thread {

    private Integer value;

    public HelloThread(Integer value) {
        this.value = value;
    }

    public void run() {
        System.out.println("Hello from a thread name = " + this.getName());
        System.out.println("Hello from a thread for value = " + value);
    }

    public static void main(String args[]) {
        for(int i = 0; i < 10; i++)
        (new HelloThread(i)).start();
    }

}
