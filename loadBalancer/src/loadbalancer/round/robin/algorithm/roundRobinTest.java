package loadbalancer.round.robin.algorithm;

public class roundRobinTest {

	public static void main(String[] args) {
		for (int request = 0; request < 100; request++) {
			System.out.println("server id " + roundRobin.getServer());
		}
	}

}
