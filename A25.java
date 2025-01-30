package com.ASS;

class StaticVsNonStatic {
    // Static variable (shared among all objects)
    static int staticCounter = 0;

    // Non-static (instance) variable (each object has its own copy)
    int instanceCounter = 0;

    // Constructor
    StaticVsNonStatic() {
        staticCounter++;  // Increment static variable
        instanceCounter++; // Increment instance variable
    }

    void displayCounts() {
        System.out.println("Static Counter (shared): " + staticCounter);
        System.out.println("Instance Counter (unique): " + instanceCounter);
    }
}

public class A25 {
    public static void main(String[] args) {
        // Creating first object
        StaticVsNonStatic obj1 = new StaticVsNonStatic();
        obj1.displayCounts();

        System.out.println("----------------");

        // Creating second object
        StaticVsNonStatic obj2 = new StaticVsNonStatic();
        obj2.displayCounts();

        System.out.println("----------------");

        // Creating third object
        StaticVsNonStatic obj3 = new StaticVsNonStatic();
        obj3.displayCounts();
    }
}

