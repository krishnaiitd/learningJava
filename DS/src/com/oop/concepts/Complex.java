package com.oop.concepts;

public class Complex implements Number<Complex> {

    private Double x;
    private Double y ;

    public Complex (Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Complex{" +
            "x=" + x +
            ", y=" + y +
            '}';
    }

    @Override
    public Complex add(Complex n) {
        return new Complex(this.x + n.x, this.y + n.y);
    }
}
