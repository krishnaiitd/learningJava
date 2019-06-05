package miniproject0.edu.coursera.concurrent.incrementExamples;

import java.util.concurrent.atomic.AtomicInteger;

public class Increment {

    /**
     * Simple counter example
     */
    private Integer simpleCounter = 0;

    public void incSimpleCounter() {
        this.simpleCounter = this.simpleCounter + 1;
    }

    public Integer getSimpleCounter() {
        return this.simpleCounter;
    }

    /**
     * Try with Synchronized key word of java
     */
    private Integer synchronizedCounter = 0;

    public synchronized void incSynchronizedCounter() {
        this.synchronizedCounter = this.synchronizedCounter + 1;
    }

    public synchronized Integer getSynchronizedCounter() {
        return this.synchronizedCounter;
    }

    /**
     * Try with volatile key words of java
     */
    private volatile Integer volatileCounter = 0;

    public void incVolatileCounter() {
        this.volatileCounter = this.volatileCounter + 1;
    }

    public Integer getVolatileCounter() {
        return this.volatileCounter;
    }

    /**
     * Try with AtomicInteger
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public void incAtomicInteger() {
        this.atomicInteger.incrementAndGet();
    }

    public Integer getAtomicInterger() {
        return this.atomicInteger.get();
    }


}
