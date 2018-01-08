package com.company.statistics.classes;

public class StandardDeviation {

    /*
    * Day 1: Standard Deviation
    * Source: https://www.hackerrank.com/challenges/s10-standard-deviation/problem
    * In this challenge, we practice calculating standard deviation.
    *
     * */

    public static double calcStandardDeviation(int size, int[] arr){

        double standardDeviation = 0.0;

        double mean =calcMean(sum(arr), size);
        double[] squareDist = new double[size];

        int index = 0;
        for (int n : arr){

            squareDist[index] = squaredDistance(arr[index], mean);
            index++;
        }

        standardDeviation = Math.sqrt(sumDouble(squareDist) / size);

        return standardDeviation;
    }

    //Calculate the squared distance from the mean
    public static double squaredDistance(int num, double mean){

        return Math.pow((double)num - mean, 2.0);
    }

    //Calculate Average or Mean
    public static double calcMean(int sum, int size){

        return (double)sum / (double) size;
    }

    //Calculate sum:
    public static int sum(int[] arr){

        int sum  = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    //Calculate sum:
    public static double sumDouble(double[] arr){

        double sum  = 0;
        for(double i : arr){
            sum += i;
        }
        return sum;
    }
}
