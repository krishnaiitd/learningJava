package com.ds;

public class HelloWorld {

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();

    }


    public static String s = "";

    public static void main(String args[]) {
//
//        int i = 1;
//        while (i <= 6) {
//            method1(i, 2);
//            i++;
//        }

        String a = "krishna";

        String b = a.concat(" Prasad");

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);

        for(Character c : a.toCharArray()) {
            System.out.println(String.valueOf(c));
            System.out.println(s);
//            s.concat(String.valueOf(c));
            s += String.valueOf(c);

        }

        System.out.println("Value of s : " + s);


//        System.out.println("Hello world!!!");
//
//
//        String a = "abc";
//        String b = "abc";
//        System.out.println(a.getClass());
//        if (a == b) {
//            System.out.println("Two String a and b  are equal with == operator");
//            System.out.println(a==b);
//        }
//
//        if (a.equals(b)) {
//            System.out.println("Two String a and b  are equal with .equeals operator");
//            System.out.println(a.equals(b));
//        }
//
//
//
//        System.out.println("=====String object=======");
//        String strA = new String("abc");
//        String strB = new String("abc");
//        System.out.println(strA.getClass());
//        System.out.println(strA == strB);
//        System.out.println(strA.equals(strB));
//        if (strA == strB) {
//            System.out.println("Two String strA and strB  are equal with == operator");
//            System.out.println(strA==strB);
//        }
//
//        if (strA.equals(strB)) {
//            System.out.println("Two String a and b  are equal with .equeals operator");
//            System.out.println(strA.equals(strB));
//        }

    }
}
