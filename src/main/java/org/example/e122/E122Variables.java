package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    private String countryName;
    private String capital;
    private int populationSize;

    public E122Variables(String countryName, String capital, int populationSize) {
        this.countryName=countryName;
        this.capital=capital;
        this.populationSize=populationSize;
    }

    // Create a method to display values of instance variables
    public void displayedValues(){
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+populationSize);

    }

    public static void main(String[] args) {
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance

        E122Variables usa=new E122Variables("USA", "Washington DC", 330000000 );
        usa.displayedValues();
        E122Variables kazakhstan=new E122Variables("Kazakhstan", "Astana", 18500000);
        kazakhstan.displayedValues();

    }
}
