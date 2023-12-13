import java.util.Arrays;

public class Main {
    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n : nums) {
            if( n <= max1) max1 = n;
            else if (n <= max2) max2 = n;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] ans = new int[]{4,3,20,1};
        System.out.println(ans.length);
        System.out.println("triplets " +increasingTriplet(ans));

        max2numbers(ans);
    }

    public static void max2numbers(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : nums) {
            if(num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }


        System.out.println("max1 number is " + max1);
        System.out.println("max2 number is " + max2);
    }
}