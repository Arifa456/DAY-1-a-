package com.ASS;

class FinalExample {
    // Final instance variable (must be initialized here or in the constructor)
    final int instanceFinalVar = 100;

    // Final static variable (constant for all objects, must be initialized immediately)
    static final double PI = 3.14159;

    // Final reference variable
    final StringBuilder message = new StringBuilder("Hello");

    void modifyVariables() {
        System.out.println("Instance Final Variable: " + instanceFinalVar);
        System.out.println("Static Final Variable: " + PI);
        
        // Uncommenting the below line will cause a compilation error, as final variables cannot be reassigned
        // instanceFinalVar = 200;

        // However, we **can** modify the internal state of final reference variables
        message.append(" World!");
        System.out.println("Modified Final Reference Variable: " + message);

        // Uncommenting the below line will cause a compilation error, as we cannot reassign a final reference
        // message = new StringBuilder("New Message");
    }
}

public class A23 {
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.modifyVariables();

        // Uncommenting the below line will cause a compilation error
        // FinalExample.PI = 3.14; // Cannot modify final static variable
    }
}

