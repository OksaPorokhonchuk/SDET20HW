package org.example.e141;

public class E141AccessModifiers {


    static int maxValue(int[]array) {
        int maxValue=0;
        for(int i=1; i< array.length; i++) {
            if(maxValue< array[i]) {
                maxValue=array[i];
            }

        }
        return maxValue;
    }
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{1,3,13,5,10,22}));

    }
}
