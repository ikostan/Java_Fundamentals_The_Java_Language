package com.company.statistics.classes;


/**
 * Quartile
 The quartiles of an ordered data set are the  points that split the data set into  equal groups.
 The  quartiles are defined as follows:

 Q1: The first quartile is the middle number between the smallest number in a data set and its median.
 Q2: The second quartile is the median ( percentile) of the data set.
 Q3: The third quartile is the middle number between a data set's median and its largest number.
 * */
public class Quartile {

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
}
