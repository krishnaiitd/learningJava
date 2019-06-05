package miniproject0.edu.coursera.concurrent.unstructureLocks;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class IncrementWithSelfLockTest {

    public static void main(String args[]) {
        IncrementWithSelfLock incrementWithSelfLock = new IncrementWithSelfLock();
        long startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            Thread t0 = new Thread(incrementWithSelfLock);
            Thread t1 = new Thread(incrementWithSelfLock);
            Thread t2 = new Thread(incrementWithSelfLock);
            Thread t3 = new Thread(incrementWithSelfLock);
            t0.start();t1.start();t2.start();t3.start();
//            try {
//                t0.join();t1.join();t2.join();t3.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            new Thread(incrementWithSelfLock).start();
//            new Thread(incrementWithSelfLock).start();
        }

        System.out.println("Total time: " + (System.nanoTime() - startTime)/1000000 + " millis seconds");

        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("After call 100 times: " + incrementWithSelfLock.getSimpleCounter());
    }
}
