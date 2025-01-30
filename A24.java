package com.ASS;

import java.util.List;
import java.util.ArrayList;

public class A24 {
    public static void main(String[] args) {
        // Using 'var' for primitive types
        var number = 10;  // Compiler infers 'int'
        var pi = 3.14159; // Compiler infers 'double'
        var isJavaFun = true; // Compiler infers 'boolean'

        System.out.println("Number: " + number);
        System.out.println("Pi Value: " + pi);
        System.out.println("Is Java Fun? " + isJavaFun);

        // Using 'var' for object types
        var message = "Hello, Java!"; // Compiler infers 'String'
        var numbersList = new ArrayList<Integer>(); // Compiler infers 'ArrayList<Integer>'
        
        numbersList.add(5);
        numbersList.add(15);

        System.out.println("Message: " + message);
        System.out.println("List: " + numbersList);

        // Using 'var' in a loop
        for (var num : numbersList) {
            System.out.println("Looping through list: " + num);
        }

        // Uncommenting the below line will cause an error, as 'var' requires initialization
        // var uninitialized; // ERROR: Cannot infer type
    }
}
