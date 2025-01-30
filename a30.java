package com.ASS;

class VolatileExample {
    private static volatile boolean flag = false; // Volatile variable

    static class Thread1 extends Thread {
        public void run() {
            try {
                // Simulating some work
                Thread.sleep(1000);
                flag = true; // Set the flag to true
                System.out.println("Thread1 has set the flag to true");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread2 extends Thread {
        public void run() {
            while (!flag) {
                // Wait for the flag to be true
            }
            System.out.println("Thread2 detected flag change to true");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t2.start();  // Start Thread2
        t1.start();  // Start Thread1

        t1.join();    // Wait for Thread1 to finish
        t2.join();    // Wait for Thread2 to finish
    }
}
