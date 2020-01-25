package non.concurrency.threads;

public class MyExample1 {

  private long countUntil;

  MyExample1(long countUntil) {
    this.countUntil = countUntil;
  }

  public void reciprocalSum() {
//    System.out.println("Running thread name is: " + Thread.currentThread().getName());
    double sum = 0;
    for (long i = 0; i < countUntil; i++) {
      sum += i > 0 ? 1.0 / (i * 1.0) : i;
    }
//    System.out.println("Total reciprocal sum is : " + sum);
  }
}
