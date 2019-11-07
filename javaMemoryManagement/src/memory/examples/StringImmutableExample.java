package memory.examples;

public class StringImmutableExample {

    public static void main(String[] args) {
        testMethod();
    }

    private static void testMethod() {
        String a = "a";
        System.out.println("a 1-->" + a);
        a = "ty";
        System.out.println("a 2-->" + a);

        // Check the details on stackoverflow example:
//        https://stackoverflow.com/questions/8798403/string-is-immutable-what-exactly-is-the-meaning
//        https://stackoverflow.com/questions/93091/why-cant-strings-be-mutable-in-java-and-net
    }


}
