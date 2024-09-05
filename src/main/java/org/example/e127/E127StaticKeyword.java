package org.example.e127;

public class E127StaticKeyword {

    // Non-static method that prints a message
    public String nonStaticMethod= "Programming is amazing.";
    // Static method that prints a message
    static String staticMethod="Java is awesome.";

    // Main method to execute both methods
    public static void main(String[] args) {
        // Create an instance of the class to call the non-static method
        E127StaticKeyword ob=new E127StaticKeyword();

          // Call non-static method
        System.out.println(ob.nonStaticMethod);

        // Call the static method directly using the class name
         // Call static method
        System.out.println(E127StaticKeyword.staticMethod);
    }
}
