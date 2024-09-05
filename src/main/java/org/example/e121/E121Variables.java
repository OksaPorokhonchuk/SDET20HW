package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int integer;
    double d;
    char ch;

    public void printInfo() {
        System.out.println(integer);
        System.out.println(d);
        System.out.println(ch);
    }



    public static void main(String[] args) {
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance

        E121Variables firstInstance = new E121Variables();
        firstInstance.integer=10;
        firstInstance.d=10.23;
        firstInstance.ch='a';
        firstInstance.printInfo();




        E121Variables secondInstance = new E121Variables();
        secondInstance.integer=100;
        secondInstance.d=100.23;
        secondInstance.ch='s';
        secondInstance.printInfo();





    }
}
