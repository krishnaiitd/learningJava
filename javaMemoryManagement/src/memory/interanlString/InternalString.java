package memory.interanlString;

public class InternalString {

    public static void main(String[] args) {
        String one = "hello";
        String two = "hello";
//        String two = new String("hello");

        // This equals check the value is equal or not
        if(one.equals(two)) {
            System.out.println("Both object value are same");
        } else {
            System.out.println("Both object value are different same");
        }

        // This == check the object are same or not
        if (one == two) {
            System.out.println("they are the same objects");
        } else {
            System.out.println("they are different objects");
        }

        System.out.println("==============");

        String three = new Integer(76).toString();
        String four = "76";
        if (three == four) {
            System.out.println("they are the same objects");
        } else {
            System.out.println("they are different objects");
        }

        String three1 = new Integer(76).toString().intern(); // intern make use the same String pool
        String four1 = "76";
        if (three1 == four1) {
            System.out.println("they are the same objects");
        } else {
            System.out.println("they are different objects");
        }

        System.out.println("===============");
        String a = "Hi";
        String b = new String("Hi"); // Added the .intern() to force to use the same String pool
        if (a == b) {
            System.out.println("they are the same objects");
        } else {
            System.out.println("they are different objects");
        }

        System.out.println("===============");
        long x = 10l;
        String y = String.valueOf(x).intern();
        String z = "10";
        if (y == z) {
            System.out.println("they are the same objects");
        } else {
            System.out.println("they are different objects");
        }

        System.out.println("===============");



//        while(true) {
//            String a1 = "1";
//        }


    }
}
