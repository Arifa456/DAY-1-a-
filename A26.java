package com.ASS;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class A26 {
    public static void main(String[] args) {
        // Primitive Variables
        int x = 10;
        int y = x; // Copying value of x into y
        y = 20; // Changing y does not affect x

        System.out.println("Primitive Variable Example:");
        System.out.println("x = " + x); // x remains 10
        System.out.println("y = " + y); // y changes to 20

        System.out.println("----------------------------");

        // Reference Variables
        Person person1 = new Person("Alice");
        Person person2 = person1; // person2 points to the same object as person1

        person2.name = "Bob"; // Changing person2 also changes person1

        System.out.println("Reference Variable Example:");
        System.out.println("person1 name: " + person1.name); // Output: Bob
        System.out.println("person2 name: " + person2.name); // Output: Bob
    }
}
