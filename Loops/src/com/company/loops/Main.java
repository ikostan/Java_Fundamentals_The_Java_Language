package com.company.loops;

public class Main {

    public static void main(String[] args) {

        int i = 0;

        while (i < 5){
            System.out.println(String.format("%d", i));
            i++;
        }

        for(int a = 0; a < 5; a++){
            System.out.println(String.format("%d", (a * 10)));
        }

        do{
            System.out.println(String.format("%d", i));
            i--;
        }while ( i > 0);

        int[] arr = {111,222,333,444,555,666,777,888,999};
        for(int n : arr){
            System.out.println(n);
        }
    }
}
