package cisco;

public class question1 {
    public static void main(String args[]) {

        int a = 8;
        System.out.println("8 =" + Integer.toBinaryString(a));
        int rightShift = a>>2;
        System.out.println("8>>1 ==" + Integer.toBinaryString(rightShift)
                + " to decimal after right shift = " + rightShift);
        int leftShift = a<<2;
        System.out.println("8<<1 ==" + Integer.toBinaryString(leftShift)
                + " to decimal value after left shift " + leftShift);

        System.out.println("============");
        System.out.println(8>>1);
        System.out.println(8>>2);
        System.out.println(8>>3);
        System.out.println(8>>4);

        System.out.println("============");
        System.out.println(8<<1);
        System.out.println(8<<2);
        System.out.println(8<<3);
        System.out.println(8<<4);



        System.out.println("============");

        int a1 = 60;          int b = -60;        int c = 0;
        System.out.println("60  = " + Integer.toBinaryString(a1));
        System.out.println("-60 = " + Integer.toBinaryString(b));

        //signed shift
        c = a1 >> 1;
        System.out.println("60 >> 1  = " + Integer.toBinaryString(c) + " decimal values = " + c);

        //unsigned shift
        c = a1 >>> 1;
        System.out.println("60 >>> 1 = " + Integer.toBinaryString(c)  + " decimal values = " + c);

        c = b >> 1;
        System.out.println("-60 >> 1  = " + Integer.toBinaryString(c)  + " decimal values = " + c);

        c = b >>> 1;
        System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c) + " decimal values " + c);



        byte num1 = 8;
        byte num2 = -8;

        System.out.println("num1 >>> 2 = " + (num1 >>> 2));
        System.out.println("num1 >> 2 = " + (num1 >> 2));
        System.out.println("num2 >>> 2 = " + (num2 >>> 2));
        System.out.println("num2 >> 2 = " + (num2 >> 2));

        Integer intput = 100;
        Integer provided = 7;
        Integer ans = 0;
        for(int i = 1; i <= provided; i++) {
            ans += intput;
        }
        System.out.println(ans);


    }
}
