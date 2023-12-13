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


    public static int knapsack_rethink(int[] weights, int[] values, int total_capacity) {
        int total_elements = weights.length;

        int[][] mm = new int[total_elements + 1][total_capacity + 1];

        for (int index = 0; index < total_elements + 1; index++) {
            for (int capacity = 0; capacity < total_capacity + 1; capacity++) {
                if (index == 0 || capacity == 0) {
                    mm[index][capacity] = 0;
                } else if (weights[index-1] <= capacity) {
                    mm[index][capacity] = Math.max(values[index-1] + mm[index - 1][capacity - weights[index - 1]], mm[index - 1][capacity]);
                } else {
                    mm[index][capacity] = mm[index - 1][capacity];
                }
            }
        }

        return mm[total_elements][total_capacity];
    }


    public static int knapsack_topDown(int weights[], int values[], int capacity, int elements_num) {


        for (int i = 0; i < elements_num + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
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
        dp = new int[elements_num + 1][capacity + 1];
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


        dp = new int[elements_num + 1][capacity + 1];
        System.out.println("Top-down:" + knapsack_topDown(weights, values, capacity, elements_num));
        for (int i = 0; i < values.length + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                System.out.print("\t " + dp[i][j]);
            }
            System.out.println("\n");
        }

        int test[] = new int[5];
        for (int index = 0; index < test.length; index++) {
            System.out.print(test[index] + ", ");
        }

        System.out.println("\nTop-down: rethink " + knapsack_rethink(weights, values, capacity));

    }
}
