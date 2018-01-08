package com.company.statistics;

import com.company.statistics.classes.*;
import java.util.Arrays;

public class Main {

    //Source: https://www.hackerrank.com/challenges/s10-basic-statistics
    public static void main(String[] args) {

        //meanMedianMode();
        //quartiles();
        //weightedMean();
        interquartileRange();
    }


    private static void interquartileRange(){

        int size = 6;
        // 6, 8, 10, 12, 16, 20
        int[]nums = {6, 12, 8, 10, 20, 16};
        //int[]freq = {5, 4, 3, 2, 1, 5}; // -> 9.0
        int[]freq = {5, 6, 7, 8, 9, 10};  // -> 8.0

        /*
        Test cases:

        #1: -> 9.0
            6
            6 12 8 10 20 16
            5 4 3 2 1 5

        #2: -> 8.0

            6
            6 12 8 10 20 16
            5 6 7 8 9 10

        #3: -> 30.0
            30
            10 40 30 50 20 10 40 30 50 20 1 2 3 4 5 6 7 8 9 10 20 10 40 30 50 20 10 40 30 50
            1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 10 40 30 50 20 10 40 30 50 20

         #4: -> 5.0

            20
            10 40 30 50 20 10 40 30 50 20 1 2 3 4 5 6 7 8 9 10
            1 2 3 4 5 6 7 8 9 10 10 40 30 50 20 10 40 30 50 20

         #5: -> 20.0

            10
            10 40 30 50 20 10 40 30 50 20
            1 2 3 4 5 6 7 8 9 10

          #6: -> 30.0

            5
            10 40 30 50 20
            1 2 3 4 5
        */

        System.out.println(InterquartileRange.calcInterquartileRange(size, nums, freq));
    }

    private static void weightedMean(){

        int size = 5;
        int[] nums = {10, 40, 30, 50, 20};
        int[] weight = {1, 2, 3, 4, 5};

        System.out.println(String.format("Weighted Mean: %.1f", WeightedMean.calcWeightedMean(size, nums, weight)));
    }

    private static void quartiles(){

        //Day 1: Quartiles
        //Source: https://www.hackerrank.com/challenges/s10-quartiles/problem
        //In this challenge, we practice calculating quartiles.
        int size = 9;
        int[] arr = {3, 7, 8, 5, 12, 14, 21, 13, 18};
        // 3, 5, 7, 8, 12, 13, 14, 18, 21
        Arrays.sort(arr);

        double[] q = Quartile.calcQuartiles(arr, size);
        System.out.println(String.format("Q1 {%.1f}", q[0]));
        System.out.println(String.format("Q2 {%.1f}", q[1]));
        System.out.println(String.format("Q3 {%.1f}", q[2]));
    }

    private static void meanMedianMode(){
        //Source: https://www.hackerrank.com/challenges/s10-basic-statistics/problem
        //Day 0: Mean, Median, and Mode
        //In this challenge, we practice calculating the mean, median, and mode.
        int size = 10;
        int[] arr = {64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060};

        System.out.println(String.format("Mean: %.1f", Mean.calcMean(Sum.sum(arr), size)));

        Arrays.sort(arr);
        System.out.println(
                String.format("Median: %.1f",
                        Median.calcMedian(arr)));

        System.out.println(
                String.format("Mode: %d",
                        Mode.clacMode(arr)));
    }
}
