package org.example.e130;

public class E130StaticKeyword {
   public static void mysteryMethod (int[] a) {
       for (int i=0; i < a.length;i++ ) {
           if(a[i]%2==0) {
               a[i]/=2;
           }else {
               a[i]*=10;
           }
       }
       for(int num:a) {
           System.out.print(num+ " ");
       }
   }



    public static void main(String[] args) {
       int [] a={20,2,3,4,5};
       mysteryMethod(a);

    }
}
