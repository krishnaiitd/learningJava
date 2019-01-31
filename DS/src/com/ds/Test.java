package com.ds;

//class test {
//
//    static int x() {
//        return 10;
//    }
//
//    public static void main(String args[]) {
//        int returnValue = x();
//        System.out.println(returnValue);
//    }
//}


class test {

    int x(test ob) {
        return 10;
    }

    public static void main(String args[]) {
        System.out.println(new test().x(new test()));
    }
}