package gsa.lexicographically;


import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class smallestLargestSubstring {
    public static List<String> getSubstringOfLenthN(String s, int N) {
        List<String> stringList = new ArrayList<>();

        if (s.length() < N) {
            return stringList;
        }

        String curr = s.substring(0, N);
        stringList.add(curr);
        for(int i = N; i < s.length(); i++) {
            curr = curr.substring(1, N) + s.charAt(i);
            stringList.add(curr);
        }

        return stringList;

    }

    public static void getAllContinousSubSet(String s) {
        List<String> strings = new ArrayList<>();

        for(int i=0; i< s.length(); i++) {

            for (int j = i+1; j < s.length(); j++) {
                String ss = s.substring(i, j);
                System.out.println(ss);
                strings.add(ss);
            }
        }

        System.out.println(strings);
    }

    public static void getSmallestAndLargest(String s, int k) {
        String currStr = s.substring(0, k);
        String minLex = currStr;
        String maxLex = currStr;
        // List<String> sortedStrigs = new ArrayList<>();
        TreeSet<String> sortedStrigs = new TreeSet<String>();
        sortedStrigs.add(currStr);
        for(int i =k; i < s.length(); i++) {
            currStr = currStr.substring(1, k) + s.charAt(i);

            if (maxLex.compareTo(currStr)< 0) {
                maxLex = currStr;
            }

            if (minLex.compareTo(currStr) > 0) {
                minLex = currStr;
            }
            sortedStrigs.add(currStr);

        }

        System.out.println(sortedStrigs);
        System.out.println("Max Lex : " + maxLex);
        System.out.println("Min Lex : " + minLex);


    }
    public static void main(String[] args)
    {
        String str = "ABC";
        int k = 2;

        getSmallestAndLargest(str, k);


        // Get all possible subsring, continuously formed from String e.g: ABC -> A, B, C, AB, BC, ABC
//        List<String> allSubsets = new ArrayList<>();
//        for(int  i = 1; i <= str.length(); i++) {
//            List<String> a = getSubstringOfLenthN(str, i);
//            allSubsets.addAll(a);
//        }
//        System.out.println(allSubsets);
    }
}
