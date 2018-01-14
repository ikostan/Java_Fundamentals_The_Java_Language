package com.company.stringformatting;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        //sampleStringJoiner();
        //sampleStringJoinerSuffix();
        //sampleStringJoinerEmpty();
        simpleStringFormat();
    }

    //String with basic Format specifier (% + conversion):
    private static void simpleStringFormat(){

        int a = 21, b = 65, c = 45;
        System.out.println(String.format("a: %d, b: %d, c: %d", a, b, c)); //Integers

        double d = 3.567867d;
        System.out.println(String.format("d: %.2f", d)); //Floating point

        String name = "John Doe";
        System.out.println(String.format("My name is %s", name)); //String
    }

    //Work with StringJoiner and empty value:
    private static void sampleStringJoinerEmpty(){

        StringJoiner sj = new StringJoiner(", ");
        sj.setEmptyValue("EMPTY");
        System.out.println(sj);

        sj.add("some value");
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
