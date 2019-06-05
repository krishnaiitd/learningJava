package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayArrayListExample {

    public static void main(String args[]) {
        // Normal array
        int intArr[] = {1,2,3, 7, 10, 1000};
        System.out.println(intArr);//I@7f31245a
        System.out.println(intArr.length); // Will work
        System.out.println(intArr[1]);// Will work
//        System.out.println(intArr[100]);// Will not work: "main" java.lang.ArrayIndexOutOfBoundsException: 100
        System.out.println(Arrays.toString(intArr));

        // Collection Framework array
        ArrayList<Integer> cArray = new ArrayList<>(2);
        cArray.add(12);
        cArray.add(13);
        System.out.println(cArray); // Will work
        System.out.println(cArray.size()); // Will work
        System.out.println(cArray.get(0)); // will work
//        System.out.println(cArray.get(100)); // will not work: "main" java.lang.IndexOutOfBoundsException: Index: 100, Size: 2

        // ArrayList will allow to add beyond the initial capacity
        cArray.add(100);
        cArray.add(100);
        cArray.add(100);
        cArray.add(100);
        cArray.add(100);
        System.out.println(cArray);


        ////////////////////////////////////////////////
        ///////Another Examples////////////////////////
        //////////////////////////////////////////////
        int intArray2[] = new int[2];
        intArray2[0] = 100;
//        intArray2[1] = 99;
        System.out.println(intArray2);
        System.out.println(intArray2.length);
        System.out.println(intArray2[1]); // Initialized by 0;
        intArray2[1] = 8888;
        System.out.println(intArray2[1]);
//        intArray2[2] = 2;// will not work : "main" java.lang.ArrayIndexOutOfBoundsException: 2
        System.out.println(intArray2.length);

        arrayListOperation();

    }

    private static void arrayListOperation() {
            String [] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

        List<String> al = new ArrayList<String>();
        Collections.addAll(al, geeks);

        System.out.println(al);

        List<String> newAl = new ArrayList<String>(Arrays.asList(geeks));
        System.out.println(newAl);



    }
}
