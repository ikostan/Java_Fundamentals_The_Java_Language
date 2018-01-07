package com.company.statistics.classes;

public class Median {

    //Calculate Median (one in the middle)
    public static double calcMedian(int[] numbers){

        if (numbers.length % 2 == 0){
            int b = numbers.length / 2;
            int a = b - 1;
            return ((double)numbers[a] + (double)numbers[b]) / 2.0;
        }
        else{

            int i = numbers.length / 2;
            return (double) numbers[i];
        }
    }
}
