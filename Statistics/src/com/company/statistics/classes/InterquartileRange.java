package com.company.statistics.classes;

import java.util.Arrays;

public class InterquartileRange {

    public static double calcInterquartileRange(int size, int[]nums, int[]freq){

        double interquartileRange = 0.0;

        int newSize = sum(freq);
        int[] newArr = new int[newSize];
        int indx = 0;
        int totalIndx = 0;

        for(int f : freq){

            for(int i = f; f > 0; f--){

                newArr[totalIndx] = nums[indx];
                totalIndx++;
            }

            indx++;
        }

        //System.out.println(String.format("Array: %s", Arrays.toString(newArr)));
        //System.out.println(String.format("Array size: %d, Size: %d", newArr.length, newSize));

        double[] q = calcQuartiles(newArr, newSize);
        interquartileRange = q[2] - q[0];

        //System.out.println(String.format("Q1: %f, Q2: %f, Q3: %f", q[0], q[1], q[2]));

        return interquartileRange;
    }

    public static double[] calcQuartiles(int[] arr, int size){

        double[] q = new double[3];
        double Q1, Q3, Q2 = calcMedian(arr);

        if(size % 2 == 0){

            int first1 = 0,
                    last1 = ((size / 2) - 1),
                    first2 = (size / 2),
                    last2 = size - 1;

            Q1 = calcMedian(arr, first1, last1);
            Q3 = calcMedian(arr, first2, last2);
        }
        else{

            int first1 = 0,
                    last1 = ((size / 2) - 1),
                    first2 = (size / 2) + 1,
                    last2 = size - 1;

            Q1 = calcMedian(arr, first1, last1);
            Q3 = calcMedian(arr, first2, last2);
        }

        q[0] = Q1;
        q[1] = Q2;
        q[2] = Q3;
        return  q;
    }

    //Calculate Median (one in the middle)
    public static double calcMedian(int[] numbers){

        Arrays.sort(numbers);

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

    //Calculate Median (one in the middle)
    public static double calcMedian(int[] numbers, int first, int last){

        //System.out.println(String.format("%d : %d", first, last));
        //System.out.println(String.format("%d : %d", numbers[first], numbers[last]));
        //System.out.println();

        int[] subArr = new int[((last - first) + 1)];

        int indx = 0;
        for (int i = first; i <= last; i++){
            subArr[indx] = numbers[i];
            indx++;
        }

        return calcMedian(subArr);
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
