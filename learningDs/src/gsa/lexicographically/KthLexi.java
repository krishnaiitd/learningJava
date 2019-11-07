package gsa.lexicographically;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//K-th lexicographically smallest unique substring of a given string
//Given a string S. The task is to print the K-th lexicographically smallest one among the different substrings of s.
//
//A substring of s is a string obtained by taking out a non-empty contiguous part in s.
//For example, if s = ababc, a, bab and ababc are substrings of s, while ac, z and
// an empty string are not. Also, we say that substrings are different when they are different as strings.
public class KthLexi {

    public static void main(String args[]) {
//        String s = "aba";
//        int k = 4;
        String s = "geeksforgeeks";
        int k = 5;
        String kthsmallest = getKthLexcographicallySubString(s, k);
        System.out.println(kthsmallest);

    }

    public static String getKthLexcographicallySubString(String s, int k) {
        // Get all possible substrings e.g ABC => A, B, C, AB, BC, ABC and then sort it and get the kth place string as smallest

        TreeSet<String> sortedSubstrings = new TreeSet<>();

        for(int i =1; i<= s.length(); i++) {
            List<String> ab = getAllSubStringOfLength(s, i);
            sortedSubstrings.addAll(ab);
        }

        // Find the kth elements from sorted list
        System.out.println(sortedSubstrings);
        int i =1;
        for(String a : sortedSubstrings) {
            if (i == k) {
                return a;
            }
            i++;
        }
        return  "";
    }

    public static List<String> getAllSubStringOfLength(String s, int length) {
        List<String> subStrs = new ArrayList<>();
        if (s.length() < length) {
            return subStrs;
        }

        String currStr = s.substring(0, length);

        subStrs.add(currStr);
        for(int i =1; i< s.length(); i++) {
            currStr = currStr.substring(1, length) + s.charAt(i);
            subStrs.add(currStr);
        }
        return  subStrs;
    }

}
