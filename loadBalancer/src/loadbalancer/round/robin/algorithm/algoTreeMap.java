package loadbalancer.round.robin.algorithm;

import java.util.Random;
import java.util.TreeMap;

public class algoTreeMap {

	public static void main(String[] args) {

		// Declaring the tree map of Integer and String
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		// assigning the values in the tree map
		// using put()
		treemap.put(20, "server 1"); // 20% traffic will goes to server 1
		treemap.put(70, "server 2"); // 50% traffic will goes to server 2
		treemap.put(100, "server 3");// 30% traffic will goes to server 3
		
		int server1Counter = 0;
		int server2Counter = 0;
		int server3Counter = 0;
		
		for(int i =0; i<100; i++) {
			int rnd = (new Random()).nextInt(100);
//			System.out.println("The next server is : " + treemap.ceilingEntry(rnd).getValue());
			String selectedServer = treemap.ceilingEntry(rnd).getValue();
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
		
		System.out.println("server 1 selected " + server1Counter);
		System.out.println("server 2 selected " + server2Counter);
		System.out.println("server 3 selected " + server3Counter);

	}

}
