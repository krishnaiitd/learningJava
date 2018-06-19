import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval {
	int buyDay;
	int buyPrice;
	int sellDay;
	int setPrice;
}

public class StockPriceProblem {
	// public void findBuySellDays(List<Integer> prices ) {
	// 	int n = prices.size();
	// 	int i = 0;
	// 	List<Interval> solutions = new ArrayList<Interval>();
	// 	while (i < n -1 ) {
	// 		Interval interval = new Interval();
	//
	// 		// first find the local minimum
	// 		while (i < n-1 && prices[i] >= prices[i+1])
	// 			i++;
	// 		// No local minimum found, no solution exist
	// 		if (i == n-1) {
	// 			System.ount.println("No solution exist");
	// 			return;
	// 		}
	// 		interval.buyDay = i++;
	// 		interval.buyPrice= prices[i];
	//
	// 		// Find the local maix
	// 		while (i < n-1 && prices[i] <= prices[i+1])
	// 			i++;
	//
	//
	// 		interval.sellDay = i;
	// 		interval.sellPrice = prices[i];
	//
	// 		solutions.add(interval);
	//
	// 	}
	// 	int totalProfit = 0;
	// 	for(Interval interval: solutions) {
	// 		totalProfit += interval.sellPrice - interval.buyPrice;
	// 		System.out.println("Buy at " + interval.buyDay +  " and sell on " + interval.sellDay + " with profit of :" + (interval.sellPrice - interval.buyPrice) );
	// 	}
	// 	System.out.println("Total profit after multiple buying and selling is : " + totalProfit);
	// }
	public static void main(String args[]) {
		List<Integer> stockPrices = new ArrayList<Integer>(Arrays.asList(100, 180, 260, 310, 40, 535, 695));
		System.out.println(stockPrices);
		// findBuySellDays(stockPrices);
	}
}
