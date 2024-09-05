package org.example.e129;

public class E129StaticKeyword {
    static String countryName;
    static String continentName;
    public void printInfo() {
        System.out.println(countryName+" located on "+continentName+" continent");
    }

    public static void main(String[] args) {
        E129StaticKeyword ob=new E129StaticKeyword();
        countryName="Morocco";
        continentName="Africa";
        ob.printInfo();


    }
}
