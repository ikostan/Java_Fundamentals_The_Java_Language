package com.company.stringformatting;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        sampleStringJoiner();
        sampleStringJoiner2();
    }

    //Work with StringJoiner:
    private static void sampleStringJoiner(){

        String[] values = new String[]{"A", "B", "C", "D"};
        StringJoiner strJoiner = new StringJoiner(", ");

        System.out.println(strJoiner);

        //Same as: strJoiner.add("A").add("B").add("C")...
        for(String str : values){

            strJoiner.add(str);
        }

        System.out.println(strJoiner);
    }

    //Work with StringJoiner:
    private static void sampleStringJoiner2(){

        String[] values = new String[]{"A", "B", "C", "D"};
        StringJoiner strJoiner = new StringJoiner("], [", "[", "]");

        System.out.println(strJoiner);

        //Same as: strJoiner.add("A").add("B").add("C")...
        for(String str : values){

            strJoiner.add(str);
        }

        System.out.println(strJoiner);
    }

}
