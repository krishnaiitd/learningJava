package miniproject0.edu.coursera.concurrent.incrementExamples;

public class BCounter implements Runnable {

    private Increment increment;

    public BCounter(Increment increment) {
        this.increment = increment;
    }

    @Override
    public void run() {
        this.increment.incSimpleCounter();
        this.increment.incSynchronizedCounter();
        this.increment.incVolatileCounter();
        this.increment.incAtomicInteger();
    }
}
