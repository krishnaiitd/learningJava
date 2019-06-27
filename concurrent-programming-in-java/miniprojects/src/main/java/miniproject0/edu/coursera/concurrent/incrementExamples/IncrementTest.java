package miniproject0.edu.coursera.concurrent.incrementExamples;

public class IncrementTest {

    public static void main(String args[]) {

        Increment increment = new Increment();

        for (int i = 0; i <= 1000; i++) {

            Thread t0 = new Thread(new ACounter(increment));
            Thread t1 = new Thread(new ACounter(increment));
            Thread t2 = new Thread(new ACounter(increment));
            Thread t3 = new Thread(new BCounter(increment));
            Thread t4 = new Thread(new BCounter(increment));
            Thread t5 = new Thread(new BCounter(increment));
            Thread t6 = new Thread(new BCounter(increment));
            t0.start();
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();

            System.out.format("State of thread t0 %s, is %s%n", t0.getName(), t0.getState());
            System.out.format("State of thread t1 %s, is %s%n", t1.getName(), t1.getState());
            System.out.format("State of thread t3 %s, is %s%n", t2.getName(), t2.getState());
            System.out.format("State of thread t4 %s, is %s%n", t3.getName(), t3.getState());
            System.out.format("State of thread t5 %s, is %s%n", t4.getName(), t4.getState());
            System.out.format("State of thread t6 %s, is %s%n", t5.getName(), t5.getState());
            System.out.format("State of thread t7 %s, is %s%n", t6.getName(), t6.getState());

        }
        System.out.format(
            "Value of simple counter after increment by A & B thread : %s%n", increment
                .getSimpleCounter());
        System.out.format(
            "Value of synchronized counter after increment by A & B thread : %s%n", increment
                .getSynchronizedCounter());
        System.out.format(
            "Value of volatile Counter after increment by A & B thread : %s%n%n", increment
                .getVolatileCounter());
        System.out.format(
            "Value of AtomicIncrement Counter after increment by A & B thread : %s%n%n", increment
                .getAtomicInterger());
    }
}
