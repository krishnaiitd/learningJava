package loadbalancer.round.robin.algorithm;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class weightedRoundRobin {

	private static int[] servers = new int[] { 1, 2, 3 };

	private static int[] serverWeights = new int[] { 10, 30, 60 };

	private static AtomicInteger ind = new AtomicInteger(0);

	public static TreeMap<Integer, String> getServerTreeMap() {

		// Declaring the tree map of Integer and String
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		int totalWeight = 0;
		for (int serverId : servers) {
			totalWeight += serverWeights[serverId - 1];
			treemap.put(totalWeight, "server " + serverId);
		}
		return treemap;
	}

	public static void main(String[] args) {

		// Get the TreeMap of server ids with wieghts as tree key values
		TreeMap<Integer, String> treemap = getServerTreeMap();

		int server1Counter = 0;
		int server2Counter = 0;
		int server3Counter = 0;
		// Test for 100 request
		for (int i = 0; i < 100; i++) {

			int serverIndex = ind.getAndIncrement();
			if (serverIndex >= 100) {
				ind = new AtomicInteger(0);
			}
//			System.out.println(serverIndex);
			String selectedServer = treemap.ceilingEntry(serverIndex).getValue();
			if (selectedServer.equals("server 1")) {
				server1Counter++;
			}
			if (selectedServer.equals("server 2")) {
				server2Counter++;
			}
			if (selectedServer.equals("server 3")) {
				server3Counter++;
			}
		}

		System.out.println("server 1 selected " + server1Counter + " times");
		System.out.println("server 2 selected " + server2Counter + " times");
		System.out.println("server 3 selected " + server3Counter + " times");

	}

}
