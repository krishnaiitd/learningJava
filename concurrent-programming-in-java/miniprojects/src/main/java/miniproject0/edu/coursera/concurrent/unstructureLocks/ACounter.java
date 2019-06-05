package miniproject0.edu.coursera.concurrent.unstructureLocks;

public class ACounter implements Runnable {

    private IncrementWithSelfLock incrementWithSelfLock;

    public ACounter(IncrementWithSelfLock incrementWithSelfLock) {
        this.incrementWithSelfLock = incrementWithSelfLock;
    }

    @Override
    public void run() {
        this.incrementWithSelfLock.incSimpleCounter();
    }

}
