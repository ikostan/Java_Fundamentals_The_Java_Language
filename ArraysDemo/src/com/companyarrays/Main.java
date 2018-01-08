package com.companyarrays;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// Working with arrays

        int[] intArr = {0,1,2,3,4,5,6,7,8,9};
        for (int i : intArr){

         System.out.print(i + ", ");
        }

        System.out.println();

        Random rnd = new Random();
        float[] fltArr = new float[10];
        for (int i = 0; i < fltArr.length; i++){

            fltArr[i] = rnd.nextFloat();
            System.out.print(fltArr[i] + ", ");
        }
    }
}
