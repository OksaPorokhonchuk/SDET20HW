package org.example.e119;

public class E119JavaMethods {

    public static String censorLetter(String s, char symbol) {
        StringBuilder replacedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == symbol) {
                replacedString.append('*');

            } else {
                replacedString.append(currentChar);
            }

        }
        return replacedString.toString();
    }





        public static void main(String[] args) {
        // Students will write the code here.
            System.out.println(censorLetter("computer science",'e'));
            System.out.println(censorLetter("trick or treat", 't'));

    }

}
