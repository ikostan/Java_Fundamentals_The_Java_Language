package com.company.statistics.classes;

import java.util.ArrayList;
import java.util.List;

public class BinominalDistro {

    /*
    * Objective
        In this challenge, we learn about binomial distributions.

      Task
        The ratio of boys to girls for babies born in Russia is 1.09 : 1.
        If there is  child born per birth, what proportion of Russian families with exactly
        6 children will have at least 3 boys?

        Write a program to compute the answer using the above parameters.
        Then print your result, rounded to a scale of decimal places (i.e., 1.234 format).

        Source: https://www.hackerrank.com/challenges/s10-binomial-distribution-1/problem
    * */

    private double p; //probability of being a boy
    private double q; //probability of being a girl
    private int totalChildren;
    private int boys;

    public BinominalDistro(double boyRatio, double girlRatio, int totalChildren, int boys){

        this.p = boyRatio / (boyRatio + girlRatio);
        this.q = girlRatio - this.p;
        this.totalChildren = totalChildren;
        this.boys = boys;
    }

    public double calcBinomialDistribution(int b, int totalChildren){

        double F = (factorial(totalChildren) / (factorial(b) * factorial(totalChildren - b))) * Math.pow(this.p, b) * Math.pow(this.q, totalChildren - b);
        return F;
    }

    public double calcEvent() {

        List<Double> E = new ArrayList<>();

        for (int i = boys; i <= this.totalChildren; i++) {
            double num = calcBinomialDistribution(i, this.totalChildren);
            System.out.println(num);
            E.add(num);
        }

        System.out.println();
        double sum = 0.0;

        for(double n : E){

            sum += n;
        }

        return sum;
    }

    private int factorial(int n){

        if(n <= 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
}
