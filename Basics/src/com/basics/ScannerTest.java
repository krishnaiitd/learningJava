package com.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        do {
            try {

                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
                String b = scan.next();
                System.out.println(a);
                System.out.println(b);
                break;

            } catch (InputMismatchException e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        } while (true);
    }

}
