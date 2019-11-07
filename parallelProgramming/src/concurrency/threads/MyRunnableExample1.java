package concurrency.threads;

public class MyRunnableExample1 implements Runnable {

	private final long countUntil;
	
	MyRunnableExample1(long countUntil) {
		this.countUntil = countUntil;
	}
	
	@Override
	public void run() {
		long sum = 0;
		for(long i = 0; i < countUntil; i ++ ) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("Running thread name is: " + Thread.currentThread().getName());
	}

}
