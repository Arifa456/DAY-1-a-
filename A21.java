package com.ASS;

class Example {
    // Instance variable (belongs to an object)
    String instanceVariable = "I am an instance variable";

    // Static variable (belongs to the class, shared by all instances)
    static String staticVariable = "I am a static variable";

    // Method to demonstrate local variable
    void show() {
        // Local variable (only accessible inside this method)
        String localVariable = "I am a local variable";

        System.out.println(localVariable); // Accessing local variable
        System.out.println(instanceVariable); // Accessing instance variable
        System.out.println(staticVariable); // Accessing static variable
    }
}

public class A21 {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.show(); // Call method to display all variables

        // Accessing instance variables
        obj1.instanceVariable = "Instance variable modified for obj1";
        System.out.println("\nObject 1: " + obj1.instanceVariable);
        System.out.println("Object 2: " + obj2.instanceVariable);

        // Accessing static variable (same for all objects)
        Example.staticVariable = "Static variable modified";
        System.out.println("\nStatic variable (accessed via class name): " + Example.staticVariable);
    }
}
