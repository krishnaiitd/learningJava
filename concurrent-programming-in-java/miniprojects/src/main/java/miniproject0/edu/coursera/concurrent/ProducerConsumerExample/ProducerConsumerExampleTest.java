package miniproject0.edu.coursera.concurrent.ProducerConsumerExample;

public class ProducerConsumerExampleTest {

    public static void main(String[] args) {

        Drop drop = new Drop();

        (new Thread(new Producer(drop))).start();

        (new Thread(new Consumer(drop))).start();
    }
}
