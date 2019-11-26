package memory.garbageCollector;

public class Main {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long availableBytes = runtime.freeMemory();
        System.out.println("Available memory " + availableBytes / 1024  + " k");
        // Let's create tons of garbage....
        for (int i = 0; i < 100; i++) {
            Customer c ;
            c = new Customer("John", 90);
        }
        availableBytes  = runtime.freeMemory();
        System.out.println("Available memory " + availableBytes / 1024  + " k");
        System.gc();
        availableBytes = runtime.freeMemory();
        System.out.println("Available memory " + availableBytes / 1024  + " k");

    }
}
