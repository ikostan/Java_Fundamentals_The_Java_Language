package com.company.statistics.classes;

public class Sum {

    //Calculate sum:
    public static int sum(int[] arr){

        int sum  = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
