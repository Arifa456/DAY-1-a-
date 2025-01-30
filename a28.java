package com.ASS;

class ShadowExample {
    int x = 10; // Instance variable

    void shadowMethod(int x) { // Method parameter shadows instance variable
        System.out.println("Method Parameter x: " + x);
        System.out.println("Instance Variable x (using this.x): " + this.x);

        int localX = 20; // Local variable shadows method parameter
        System.out.println("Local Variable x: " + localX);

        // Block-level shadowing
        {
            int blockX = 30; // Block-level variable shadows local variable
            System.out.println("Block Variable x: " + blockX);
        }

        // Outside block, local variable is still in effect
        System.out.println("Local Variable x after block: " + localX);
    }
}

public class a28 {
    public static void main(String[] args) {
        ShadowExample obj = new ShadowExample();
        obj.shadowMethod(5); // Passing 5 as method parameter
    }
}

