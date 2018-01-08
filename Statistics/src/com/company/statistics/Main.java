package com.company.statistics;

import com.company.statistics.classes.Mean;
import com.company.statistics.classes.Median;
import com.company.statistics.classes.Mode;
import com.company.statistics.classes.Sum;

import java.util.Arrays;

public class Main {

    //Source: https://www.hackerrank.com/challenges/s10-basic-statistics
    public static void main(String[] args) {

        meanMedianMode();

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
