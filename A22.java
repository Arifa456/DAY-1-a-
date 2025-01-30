package com.ASS;

class ScopeExample {
    // Instance variable (Class Scope - belongs to an object)
    int instanceVar = 10;

    // Static variable (Class Scope - shared across objects)
    static int staticVar = 20;

    // Method to demonstrate different scopes
    void demonstrateScope() {
        // Local variable (Method Scope)
        int localVar = 30;

        System.out.println("Inside demonstrateScope method:");
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);

        // Block Scope inside a conditional statement
        if (true) {
            int blockVar = 40; // Block-scoped variable
            System.out.println("Block Variable: " + blockVar);
        }

        // Uncommenting the below line will cause an error, as blockVar is out of scope
        // System.out.println(blockVar);
    }
}

public class A22 {
    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();

        System.out.println("Inside main method:");
        System.out.println("Instance Variable (accessed via object): " + obj.instanceVar);
        System.out.println("Static Variable (accessed via class): " + ScopeExample.staticVar);

        obj.demonstrateScope();

        // Uncommenting the below line will cause an error, as localVar is not accessible outside demonstrateScope
        // System.out.println(localVar);
    }
}
