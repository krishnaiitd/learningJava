package concurrency.threads;

public class MyRunnableExample1 implements Runnable {

  private final long countUntil;

  MyRunnableExample1(long countUntil) {
    this.countUntil = countUntil;
  }

  @Override
  public void run() {
//    System.out.println("Running thread name is: " + Thread.currentThread().getName());
    double sum = 0;
    for (long i = 0; i < countUntil; i++) {
      sum += i > 0 ? 1.0 / (i * 1.0) : i;
    }
//    System.out.println("Total reciprocal sum is : " + sum);
  }

}
