package miniproject0.edu.coursera.concurrent;

public class ThreadClassExample {

    public static void main(String args[]) {
        setup(10);
    }

    /**
     * A simple method for Runnable and Thread class
     *
     * @param val Input value
     * @return Dummy value
     */
    public static int setup(final int val) {
        final int[] result = new int[1];

        result[0] = val;

//        Multi multi = new Multi();
//        multi.setName("maulti-1");
//        multi.start();
//        Multi multi2 = new Multi();
//        multi2.setName("maulti-1");
//        multi2.start();
//        Multi multi3 = new Multi();
//        multi3.setName("maulti-1");
//
//        multi3.start();


        //1.  Directly pass the Runnable class
//        new Thread(new RunnableClass()).start();

        // 2.
        new Thread(new Multi()).start();

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
