package com.company.statistics.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mode {

    //Find mode - the most common number
    private static int clacMode(int[] numbers){

        List<Integer> set = new ArrayList<>();

        for (int num : numbers){

            if(set.contains(num) == false){

                set.add(num);
            }
        }

        Collections.sort(set);
        int mode = numbers[0];
        int max = 0;

        //System.out.println("start");
        for(int num : set){
            //System.out.println(num);
            int curMax = 0;
            for(int n : numbers){
                //System.out.println(n);
                if(num == n){

                    curMax++;
                }
            }

            if (curMax > max){

                max = curMax;
                mode = num;
            }
        }

        return mode;
    }
}
