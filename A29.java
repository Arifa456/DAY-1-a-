package com.ASS;

class DefaultValuesExample {
    // Instance variables
    int intVar;             // Default value: 0
    double doubleVar;       // Default value: 0.0
    boolean boolVar;        // Default value: false
    String strVar;          // Default value: null

    // Static variables
    static int staticIntVar;   // Default value: 0
    static boolean staticBoolVar;  // Default value: false
    static String staticStrVar;   // Default value: null
}

public class A29 {
    public static void main(String[] args) {
        // Create an instance of DefaultValuesExample to see default values
        DefaultValuesExample obj = new DefaultValuesExample();

        // Displaying default values of instance variables
        System.out.println("Instance Variables:");
        System.out.println("intVar (Instance): " + obj.intVar);
        System.out.println("doubleVar (Instance): " + obj.doubleVar);
        System.out.println("boolVar (Instance): " + obj.boolVar);
        System.out.println("strVar (Instance): " + obj.strVar);

        // Displaying default values of static variables
        System.out.println("\nStatic Variables:");
        System.out.println("staticIntVar (Static): " + DefaultValuesExample.staticIntVar);
        System.out.println("staticBoolVar (Static): " + DefaultValuesExample.staticBoolVar);
        System.out.println("staticStrVar (Static): " + DefaultValuesExample.staticStrVar);
    }
}
