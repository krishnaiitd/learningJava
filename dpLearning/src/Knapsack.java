public class Knapsack {

    static public int[][] dp;

    static int knapsack_recursive(int[] weights, int[] values, int capacity, int elements_num) {
        if (elements_num == 0 || capacity == 0) {
            return 0;
        }

        // Select choice
        if (weights[elements_num - 1] <= capacity) {
            return Math.max(values[elements_num - 1] + knapsack_recursive(weights, values, capacity - weights[elements_num - 1], elements_num - 1), knapsack_recursive(weights, values, capacity, elements_num - 1));
        } else {
            return knapsack_recursive(weights, values, capacity, elements_num - 1);
        }
    }

    public static int knapsack_memorisation(int weights[], int values[], int capacity, int elements_num) {
        if (elements_num == 0 || capacity == 0) {
            return 0;
        }

        if (dp[elements_num][capacity] != -1) return dp[elements_num][capacity];

        if (weights[elements_num - 1] <= capacity) {
            return dp[elements_num][capacity] = Math.max(values[elements_num - 1] + knapsack_memorisation(weights, values, capacity - weights[elements_num - 1], elements_num - 1), knapsack_memorisation(weights, values, capacity, elements_num - 1));
        } else {
            return dp[elements_num][capacity] = knapsack_memorisation(weights, values, capacity, elements_num - 1);
        }

    }

    public static int knapsack_topDown(int weights[], int values[], int capacity, int elements_num) {

        for (int i = 1; i < elements_num + 1; i++) {
            for (int j = 1; j < capacity + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(values[i - 1] + dp[i - 1][j - weights[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[elements_num][capacity];
    }

    public static void main(String[] args) {
        int weights[] = new int[]{1, 3, 4, 5};
        int values[] = new int[]{1, 4, 5, 7};
        int capacity = 7;
        int elements_num = weights.length;
        System.out.println("Recursive call: " + knapsack_recursive(weights, values, capacity, elements_num));
        dp = new int[values.length + 1][+1];
        for (int i = 0; i < elements_num + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("Memorization call: " + knapsack_memorisation(weights, values, capacity, elements_num));
        for (int i = 0; i < values.length + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                System.out.print("\t " + dp[i][j]);
            }
            System.out.println("\n");
        }
        dp = new int[values.length + 1][capacity + 1];
        for (int i = 0; i < values.length + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                dp[i][j] = 0;
            }
        }
        System.out.println("Top-down:" + knapsack_topDown(weights, values, capacity, weights.length));
        for (int i = 0; i < values.length + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                System.out.print("\t " + dp[i][j]);
            }
            System.out.println("\n");
        }
    }
}
