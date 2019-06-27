package miniproject0.edu.coursera.concurrent.ProducerConsumerExample;

import java.util.Random;

public class Producer implements Runnable {

    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too",
            "Mares eat oats 2",
            "Does eat oats 2",
            "Little lambs eat ivy 2",
            "A kid will eat ivy too 2",
            "Mares eat oats 3",
            "Does eat oats 3",
            "Little lambs eat ivy 3",
            "A kid will eat ivy too 3",
            "Mares eat oats 4",
            "Does eat oats 4",
            "Little lambs eat ivy 4",
            "A kid will eat ivy too 4"
        };
        Random random = new Random();

        for (int i = 0;
            i < importantInfo.length;
            i++) {
            drop.put(importantInfo[i]);
            System.out.format("MESSAGE SENT: %s%n", importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
            }
        }
        drop.put("DONE");
    }
}
