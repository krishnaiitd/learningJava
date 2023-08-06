public class Knapsack {

    static public int[][] dp;

    static int knapsack_recursive(int[] wt, int[] val, int w, int n) {
        if (n ==0 ||w == 0) {
            return 0;
        }

        // Select choice
        if (wt[n-1] <= w) {
            return Math.max(
                    val[n-1] + knapsack_recursive(wt, val, w-wt[n-1], n-1),
                    knapsack_recursive(wt, val, w, n-1));
        } else {
            return knapsack_recursive(wt, val, w, n-1);
        }
    }

    public static int knapsack_memorisation(int wt[], int val[], int w, int n) {
        if (n == 0 || w == 0) {return 0;}

        if (dp[n][w] != -1) return dp[n][w];

        if (wt[n-1] <= w) {
            return dp[n][w] = Math.max(
                    val[n-1] + knapsack_memorisation(wt, val, w-wt[n-1], n-1),
                    knapsack_memorisation(wt, val, w, n-1));
        } else {
           return dp[n][w] = knapsack_memorisation(wt, val, w, n-1);
        }

    }

    public static int knapsack_topDown(int wt[], int val[], int w, int n) {

        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < w + 1; j++) {
                if (i ==0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i-1] <= j) {
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        int wt[] = new int[]{1, 3, 4, 5};
        int val[] = new int[]{1, 4, 5, 7};
        int w = 7;

        System.out.println("Recursive call: " + knapsack_recursive(wt, val, w, wt.length));
        dp = new int[val.length +1][w + 1];
        for(int i                                   = 0; i < val.length + 1; i++) {
            for(int j = 0; j < w + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("Memorization call: " + knapsack_memorisation(wt, val, w, wt.length));
        for(int i = 0; i < val.length + 1; i++) {
            for(int j = 0; j < w + 1; j++) {
                System.out.print("\t " + dp[i][j]);
            }
            System.out.println("\n");
        }
        dp = new int[val.length +1][w + 1];
        for(int i = 0; i < val.length + 1; i++) {
            for(int j = 0; j < w + 1; j++) {
                dp[i][j] = 0;
            }
        }
        System.out.println("Top-down:" + knapsack_topDown(wt, val, w, wt.length));
        for(int i = 0; i < val.length + 1; i++) {
            for(int j = 0; j < w + 1; j++) {
                System.out.print("\t " + dp[i][j]);
            }
            System.out.println("\n");
        }
    }
}
