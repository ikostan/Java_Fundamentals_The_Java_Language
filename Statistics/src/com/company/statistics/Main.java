package com.company.statistics;

import com.company.statistics.classes.*;
import java.util.Arrays;

public class Main {

    //Source: https://www.hackerrank.com/challenges/s10-basic-statistics
    public static void main(String[] args) {

        meanMedianMode();
        quartiles();
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
