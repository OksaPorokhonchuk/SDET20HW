package org.example.e126;

import org.example.e123.E123Variables;

public class E126Variables {
    // Declare a static variable at the class level to hold the count of all instances of the class
    static int instanceCount = 0;


    // Constructor to increment the count
    public E126Variables() {
        instanceCount++;


    }


    public static void main(String[] args) {
        // Create 3 objects of the class
        E126Variables ob1 = new E126Variables();
        E126Variables ob2 = new E126Variables();
        E126Variables ob3 = new E126Variables();


        // Print the value of the count variable
        System.out.println(instanceCount);

    }
}

