package miniproject0.edu.coursera.concurrent.unstructureLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IncrementWithSelfLock implements Runnable {

    /**
     * Simple counter example
     */
    private Integer simpleCounter = 0;

    private final Lock lock = new ReentrantLock();

    public void incSimpleCounter() {
        lock.lock();
        try {
            this.simpleCounter = this.simpleCounter + 1;
        } finally {
            lock.unlock();
        }
    }

    public Integer getSimpleCounter() {
        return this.simpleCounter;
    }


    @Override
    public void run() {
        this.incSimpleCounter();
    }
}
