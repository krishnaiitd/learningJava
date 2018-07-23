package loadbalancer.round.robin.algorithm;

import java.util.concurrent.atomic.AtomicInteger;

public class roundRobin {

	private static int[] servers = new int[] { 0, 1, 2 };

	private static AtomicInteger ind = new AtomicInteger(0);

	public static int getServer() {
//		int serverIndex = Math.abs((int) ind.getAndIncrement() % servers.length);
//		
//		return servers[serverIndex];
		
		return servers[Math.abs((int) ind.getAndIncrement() % servers.length)];
	}

	public static int getServerLambda() {
		return servers[ind.getAndAccumulate(servers.length, (cur, n) -> cur >= n - 1 ? 0 : cur + 1)];
	}
}
