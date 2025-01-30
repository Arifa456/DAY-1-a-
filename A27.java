package com.ASS;

class Circle {
    // Define constant PI using static final
    static final double PI = 3.14159;

    // Method to calculate area
    static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    // Method to calculate circumference
    static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}

public class A27 {
    public static void main(String[] args) {
        double radius = 5.0; // Example radius

        // Using static methods to calculate values
        double area = Circle.calculateArea(radius);
        double circumference = Circle.calculateCircumference(radius);

        System.out.println("For a circle with radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

