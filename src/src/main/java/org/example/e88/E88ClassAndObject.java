package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"

        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"

        // Call the methods 'bark()', 'run()', and 'play()' for each object

        Dog firstDog= new Dog();
        firstDog.breed= "Husky";
        firstDog.name= "Rex";
        firstDog.color= "Red";

        Dog secondDog= new Dog();
        secondDog.breed= "Bulldog";
        secondDog.name= "Topic";
        secondDog.color="Black";

        Dog thirdDog=new Dog();
        thirdDog.breed="Labrador";
        thirdDog.name= "Tuzik";
        thirdDog.color="Brown";

        firstDog.bark();
        firstDog.run();
        firstDog.play();

        secondDog.bark();
        secondDog.run();
        secondDog.play();

        thirdDog.bark();
        thirdDog.run();
        thirdDog.play();



    }
}
