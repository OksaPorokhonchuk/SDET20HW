package org.example.e138;
public class E138AccessModifiers {

        static void method() {
              System.out.println("default");
       }
       protected static void method1() {
              System.out.println("protected");
       }
       public static void method2() {
              System.out.println("public");
       }

       public static void main(String[] args) {
               E138AccessModifiers access=new E138AccessModifiers();
               access.method();
               access.method1();
               access.method2();


       }
}
