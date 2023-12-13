import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class subsetSum {

    public static boolean is_subset_sum_exist(int[] elements, int sum) {
        boolean mm[][] = new boolean[elements.length + 1][sum + 1];

        for (int index = 0; index < elements.length + 1; index++) {
            for (int mini_sum = 0; mini_sum < sum + 1; mini_sum++) {

                if (mini_sum == 0) {
                    mm[index][mini_sum] = true;
                } else if (index == 0) {
                    mm[index][mini_sum] = false;
                } else {

                    if (elements[index - 1] <= mini_sum) {
                        mm[index][mini_sum] = mm[index - 1][mini_sum - elements[index - 1]] || mm[index - 1][mini_sum];
                    } else {
                        mm[index][mini_sum] = mm[index - 1][mini_sum];
                    }
                }
            }
        }

        for (int index = 0; index < elements.length + 1; index++) {
            for (int j = 0; j < sum + 1; j++) {
                System.out.print("\t" + mm[index][j]);
            }
            System.out.println("");
        }

        return mm[elements.length][sum];

    }

    /*
    Count of subsets sum with a given sum
     */
    public static int number_of_subset(int[] elements, int sum) {
        int mm[][] = new int[elements.length + 1][sum + 1];

        for (int index = 0; index < elements.length+1; index++) {
            for (int mini_sum = 0; mini_sum < sum + 1; mini_sum++) {
                if (mini_sum == 0) {
                    // If empty subset exist whose sum is =0
                    mm[index][mini_sum] = 1;
                } else if (index == 0) {
                    mm[index][mini_sum] = 0;
                } else {
                    if (elements[index - 1] <= mini_sum) {
                        mm[index][mini_sum] = mm[index - 1][mini_sum - elements[index - 1]] + mm[index - 1][mini_sum];
                    } else {
                        mm[index][mini_sum] = mm[index - 1][mini_sum];
                    }
                }
            }
        }

        for (int index = 0; index < elements.length + 1; index++) {
            for (int j = 0; j < sum + 1; j++) {
                System.out.print("\t" + mm[index][j]);
            }
            System.out.println("");
        }

        return mm[elements.length][sum];
    }


    public static int minimum_subset_sum(int[] elements) {
        int sum = Arrays.stream(elements).sum();

        int half_range = sum / 2;
        ArrayList possible_sum = new  ArrayList<Integer>();
        for(int mini_sum =0 ; mini_sum < half_range + 1; mini_sum++) {
            if (is_subset_sum_exist(elements, mini_sum)) {
                possible_sum.add(mini_sum);
            }
        }
        System.out.println(possible_sum);

        int min_sum = Integer.MAX_VALUE;

        for(int index = 0; index < possible_sum.size(); index++) {
            int s1 = (int) possible_sum.get(index);
            int s2 = sum - s1;
            min_sum = Math.min(min_sum, Math.abs(s1-s2));
        }

        return min_sum;
    }

    // Count the number of subset with a given difference
    public static int subset_count_with_difference(int elements[], int diff) {
        int sum = 0;
        for(int index = 0; index < elements.length; index++) {
            sum += elements[index];
        }
        int target_sum = (diff + sum)/ 2;

        return number_of_subset(elements, target_sum);

    }


    public static void main(String[] args) {
        int[] elements = new int[]{2, 3, 7, 8, 10};
        int sum = 10;
        System.out.println("Subset sum " + sum + " is exist : " + is_subset_sum_exist(elements, sum));

        int[] elements2 = new int[]{2, 3, 5, 6, 8, 10};
        int sum1 = 10;
        System.out.println("Number of subsets " + number_of_subset(elements2, sum1));

        // Minimum subset sum
        int[] elements3 = new int[]{1, 2, 7};

        System.out.println("Minimum sum : " + minimum_subset_sum(elements3));

        int[] elements4 = new int[]{1, 1, 2, 3};
        int diff = 1;
        System.out.println("Number of subset with diff 1 is " + subset_count_with_difference(elements4, diff));
//        [{{1,1,2}. {3}}, {{1,2}, {1,3}}, ]
    }
}
