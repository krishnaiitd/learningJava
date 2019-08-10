package com.basics;

public class ThreadedDebugging {

    public static void main(String[] args) {
        String[] arguments = args;
        Thread a = new Thread(() -> {
            while (true) {
                System.out.print("A");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread b = new Thread(() -> {
            while (true) {
                System.out.print("B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        b.start();
        a.start();
    }
}
