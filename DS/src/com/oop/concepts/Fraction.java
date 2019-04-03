package com.oop.concepts;

public class Fraction implements Number<Fraction> {

    private float a;

    public Fraction(float a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Fraction{" +
            "a=" + a +
            '}';
    }

    @Override
    public Fraction add(Fraction n) {
        return new Fraction(this.a + n.a);
    }
}
