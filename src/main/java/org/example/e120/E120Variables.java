package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number

    int year;
    String schoolName;
    int batchNumber;


    public static void main(String[] args) {
        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
        E120Variables hold=new E120Variables();
        hold.year=2020;
        hold.schoolName="Syntax";
        hold.batchNumber=6;

        System.out.println("I am a student of batch "+hold.batchNumber+ " studying at " +hold.schoolName+ " in the year of "+hold.year);


    }
}
