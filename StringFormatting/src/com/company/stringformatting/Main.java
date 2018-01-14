package com.company.stringformatting;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        sampleStringJoiner();
        sampleStringJoinerSuffix();
        sampleStringJoinerEmpty();

    }

    //Work with StringJoiner and empty value:
    private static void sampleStringJoinerEmpty(){

        StringJoiner sj = new StringJoiner(", ");
        sj.setEmptyValue("EMPTY");
        System.out.println(sj);
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

    //Work with StringJoiner and prefix/suffix:
    private static void sampleStringJoinerSuffix(){

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
