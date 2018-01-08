package com.company.statistics.classes;

public class WeightedMean {

    /*
        Day 0: Weighted Mean
        Source: https://www.hackerrank.com/challenges/s10-weighted-mean/problem
        In the previous challenge, we calculated a mean. In this challenge,
        we practice calculating a weighted mean.
    */
    public static double calcWeightedMean(int size, int[] nums, int[] weight){

        double weightedMean = 0.0;
        int index = 0;

        int wSum = sum(weight);
        int numSum = 0;

        for(int w : weight){

            numSum += w * nums[index];
            index++;
        }

        weightedMean = (double)numSum / (double)wSum;

        return weightedMean;
    }

    //Calculate sum:
    public static int sum(int[] arr){

        int sum  = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
