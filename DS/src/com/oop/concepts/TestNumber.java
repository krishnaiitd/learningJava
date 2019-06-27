package com.oop.concepts;

public class TestNumber {

    public static void main (String args[]) {

        Complex c1 = new Complex(3.4, 56.78);
        Complex c2 = new Complex(3.4, 56.78);

        Complex c3 = c1.add(c2);

        System.out.println(c3);

        Fraction f1 = new Fraction(3.4f);
        Fraction f2 = new Fraction(1.0f);
        Fraction f3 = f1.add(f2);

        System.out.println(f3);


    }
}
