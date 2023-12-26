package learning.array;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] snums = new int[nums.length];
        int negativeEndIndex = 0;
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] >= 0) {
                negativeEndIndex = index;
                break;
            }
        }
        int i = negativeEndIndex -1 ;// End of negative numbers
        int j = negativeEndIndex;// Start of positive nbumbers
        // Lowest numbet should be at nums[i-1] or nums[i]
        //We have to use the information that sorted arrays
        int sArrayIndex = 0;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        while(i >= 0 && j < nums.length) {

            if (nums[i]*nums[i] < nums[j]*nums[j]) {
                snums[sArrayIndex] = nums[i]*nums[i];
                i--;
            } else {
                snums[sArrayIndex] = nums[j]*nums[j];
                j++;
            }
            sArrayIndex++;
        }

        while (i >= 0) {
            snums[sArrayIndex] = nums[i]*nums[i];
            i--;
            sArrayIndex++;
        }

        if(i == -1 && nums[nums.length-1] < 0) {
                sArrayIndex = nums.length - 1;
                while(j < nums.length) {
                    snums[sArrayIndex] = nums[j]*nums[j];
                    j++;
                    sArrayIndex--;
                }
        }


        while(j < nums.length) {
            snums[sArrayIndex] = nums[j]*nums[j];
            j++;
            sArrayIndex++;
        }

        return snums;

    }

    public static void main(String[] args) {

        int[] sortedNegativeArray = {-5, -3, -2, -1};

        int [] a = {0, 4};

        Arrays.stream(sortedSquares(sortedNegativeArray)).forEach(System.out::println);
        Arrays.stream(sortedSquares(a)).forEach(System.out::println);
    }
}
