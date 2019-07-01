package miniproject0.edu.coursera.concurrent;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {

    private List queue = new LinkedList();
    private int limit;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public int size() {
        return this.queue.size();
    }

    public synchronized void enqueue(Object item) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }

        if (this.queue.size() == 0) {
            notifyAll();
        }

        this.queue.add(item);
    }

    public synchronized Object dequeue() throws InterruptedException {
        if (this.queue.size() == 0) {
            wait();
        }

        if (this.queue.size() == this.limit) {
            notifyAll();
        }

        return this.queue.remove(0);
    }

    public static void main(String args[]) throws InterruptedException {


        // define capacity of ArrayBlockingQueue
        int capacity = 5;

        // create object of ArrayBlockingQueue
//        ArrayBlockingQueue<String>
//            queue = new ArrayBlockingQueue<String>(capacity);
                BlockingQueue queue = new BlockingQueue(5);
//

//        // Add elements to ArrayBlockingQueue using put method
//        queue.put("StarWars");
//        queue.put("SuperMan");
//        queue.put("Flash");
//        queue.put("BatMan");
//        queue.put("Avengers");
//        queue.put("Avengers 21");
//
//        System.out.println(queue.size());

        Thread putThread = new Thread(() -> {
            for(int i =0; i < 10; i++) {
                try {
                    queue.enqueue("values");
                    System.out.println("Push elemenets successfully, total size " + queue.size());
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread pullThread = new Thread(() -> {

            for(int i =0; i< 10; i++) {
                try {
                  Object s = queue.dequeue();
                  System.out.println("Got value from queue: " + s + " now size is " + queue.size());
                  Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        putThread.start();
        pullThread.start();


//        BlockingQueue blockingQueue = new BlockingQueue(5);
//
////        for(int i =0; i < 10; i++) {
//
//           Thread  putThread = new Thread( () -> {
//                try {
//                    for(int i=0; i <= 10; i++) {
//                        blockingQueue.enqueue(5);
//                        System.out.println("Enqueue successfully");
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//
//            Thread  pullThread = new Thread( () -> {
//                try {
//                    Object t = blockingQueue.dequeue();
//                    System.out.println("Got element :" + t);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//
//            putThread.start();
//            pullThread.start();
//            System.out.println(putThread.getState());
//            System.out.println(pullThread.getState());
////        }
//

    }
}
