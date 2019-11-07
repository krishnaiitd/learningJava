package gsa.lexicographically;

public class Add2InNextCellInArray {

//    Question 1: Given an array, starting from the beginning of the array till it’s end, whenever you
//     encounter the number ‘2’, add another ‘2’ just after it. In doing so, the last element in the
//     array would be removed, because the final array should be the same size as the initial one.
//     For example, if the initial array is [23, 2, 3, 12, 2, 2, 34, 55, 66, 79], then the modified
//     array should be [23, 2, 2, 3, 12, 2, 2, 2, 2, 34]. Expected time complexity is O(n) and you
//     should do it in place (using only constant amount of extra memory).
    public static void question1() {
        int[] a = {23, 2, 3, 12, 2, 2, 34, 55, 66, 79};
        for (int i = 0; i < a.length; i++) {
            int temp = -1;
            if (a[i] == 2) {
                if (i + 1 < a.length) {
                    temp = a[i + 1];
                    a[i + 1] = 2;
                    i++;
                }
            }
            if (temp != -1) {
                for (int j = i + 1; j < a.length; j++) {
                    int temp2 = a[j];
                    a[j] = temp;
                    temp = temp2;
                }
            }
        }

        for (int item : a) {
            System.out.println(item);
        }
    }

// Question 2: There are ‘n’ ads. Each ad has an effectiveness value associated with it which is
// given in an array of size ‘n’ in the format [v1, v2, …, vn], where ‘v1’ is the effectiveness
// value of the first ad, ‘v2’ is the effectiveness value of the second ad, and so on.
// The show in which these ads will be shown is ‘m’ length long (starting from 0 till m),
// and the time when the ads can be shown is given in the format [(a1, b1), (a2, b2), …, (an, bn)],
// where ith tuple in the array denotes the timing of the ith ad in the format (start_time, end_time).
// Note that any ‘ai’ and ‘bi’ cannot be smaller than 0 and cannot be larger than ‘m’.
// When you choose to show an ad, you cannot show another ad within 4 minutes of it’s end.
// So if you select to show the ad having timings as (2, 4), then you cannot show another ad before 9,
// hence next ad cannot be (8, 10), but it can be (9, 12). You have to select the ads to show to
// the audience such that you maximize the sum of the effectiveness values of the ads,
// given the above constraints. For example, if ‘m’ is 20, and the timings of the ads are
// [(2, 3), (6, 9), (10, 12), (12, 13), (14, 17)] and the effectiveness values are [3, 9, 10, 6, 7],
// then you can show ad 2 and ad 5 (one-based-indexing) and have an effectiveness value of 16, which is
//  1the maximum you can get given the constraints.

    public static void main(String arg[]) {
        question1();
    }


}
