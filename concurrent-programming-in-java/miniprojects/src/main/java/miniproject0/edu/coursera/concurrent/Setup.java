package miniproject0.edu.coursera.concurrent;

import static edu.rice.pcdp.PCDP.async;
import static edu.rice.pcdp.PCDP.finish;

/**
 * A simple class for testing compilation of an PCDP project.
 */
public final class Setup {

    /**
     * Default constructor.
     */
    private Setup() {
    }

    /**
     * A simple method for testing compilation of an PCDP project.
     *
     * @param val Input value
     * @return Dummy value
     */
    public static int setup(final int val) {
        final int[] result = new int[1];
        finish(() -> {
            async(() -> {
                result[0] = val;
            });
        });

//        RunnableClass runnableClass = new RunnableClass();
//        runnableClass.run();

        Multi multi = new Multi();
        multi.setName("maulti-1");
        multi.start();
        Multi multi2 = new Multi();
        multi2.setName("maulti-1");
        multi2.start();
        Multi multi3 = new Multi();
        multi3.setName("maulti-1");

        multi3.start();


        return result[0];
    }

    public static class RunnableClass implements Runnable {

        @Override
        public void run() {
            System.out.println("thread name: " + this.toString());
            System.out.println("thread is running from RunnableClass...");

        }
    }

    public static class Multi extends Thread {

        public void run() {
            System.out.println("thread name: " + this.getName());
            System.out.println("thread is running from Multi...");

        }
    }
}
