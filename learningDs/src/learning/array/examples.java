package learning.array;

import java.util.Arrays;

public class examples {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int cmax = Integer.MIN_VALUE;
        int runningC = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 0) {
                runningC = 0;
            }
            if(nums[i] == 1) {
                runningC++;
            }
            cmax =  Integer.max(runningC, cmax);
        }
        return cmax;
    }

    public static int numberOfDigits(int number) {
        int digits = 0;
        while(number > 0) {
            number = number/10;
            digits++;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] a  = new int[5];
        for(int i = 0; i < a.length; i++) {
            System.out.println("value a[" + i + "] = " +a[i]);
            a[i] = i;
        }

        System.out.println(Arrays.stream(a).sum());
//        System.out.println(Arrays.stream(a).reduce(identity, +));
        System.out.println(Arrays.stream(a).reduce(0, (subtotal, element) -> subtotal + element));
        System.out.println(Arrays.stream(a).reduce(0, Integer::sum));

        int nums[] = new int[]{1, 0, 0, 1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(nums));

        int aa = 234;
        System.out.println("number of digits " + numberOfDigits(aa));
    }
}
