package cisco;

public class BinaryOperator {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte)(a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);

        byte c = 2, d;
        int j;
        j = c>>1;
        d = (byte)(c>>1);
        System.out.println("Original value of a: " + c);
        System.out.println("i and b: " + j + " " + d);

    }
}
