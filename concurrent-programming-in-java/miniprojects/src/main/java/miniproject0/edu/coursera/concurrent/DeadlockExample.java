package miniproject0.edu.coursera.concurrent;

public class DeadlockExample {

    static class Friend {

        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                    + "  has bowed to me!%n",
                this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                    + " has bowed back to me!%n",
                this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
            new Friend("Alphonse");

        final Friend gaston =
            new Friend("Gaston");

        Thread t0 = new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        });

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        });

        t0.start();
        t1.start();
        System.out.println("t0 state: " + t0.getState());
        System.out.println("t1 state: " + t1.getState());
    }
}
