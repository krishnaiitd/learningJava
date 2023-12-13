public class EqualSumPartition {
    public static boolean is_subset_exist(int elements[], int sum) {
        boolean mm[][] = new boolean[elements.length+1][sum + 1];
        for(int index  = 0; index < elements.length + 1; index++) {
            for(int mini_sum = 0; mini_sum < sum + 1; mini_sum++) {
                // if mini_sum == 0 then empty subset always exist
                if(mini_sum == 0) {
                    mm[index][mini_sum] = true;
                } else if (index == 0) {
                    // no elements exist then no sum values can be possible
                    mm[index][mini_sum] = false;
                } else {
                    // if the elements values is less than mini sum then consider it
                    if (elements[index-1] <= mini_sum) {
                        mm[index][mini_sum] = mm[index - 1][mini_sum - elements[index-1]] || mm[index - 1][mini_sum];
                    } else {
                        mm[index][mini_sum] = mm[index-1][mini_sum];
                    }
                }
            }
        }

        return mm[elements.length][sum];
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 11, 8};

        int sum = 0;
        for(int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        if (sum % 2 == 0) {
            System.out.println("Is equal subset sum partition possible = " + is_subset_exist(arr, sum/2));
        } else {
            System.out.println("Is equal subset sum partition possible = False" );
        }

    }
}
