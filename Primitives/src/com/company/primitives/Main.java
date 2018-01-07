package com.company.primitives;

public class Main {

    public static void main(String[] args) {

        System.out.println("Variables, Data Types, and Math Operators\n");

        //Local primitive variables
        int dataValue = 100;
        int myVar;
        myVar = 10;

        byte bt = 120;
        short sh = 30534;
        long ln = 356735673567356L;

        double d = 0.95D;
        boolean bool = true;
        char ch = 'a';
        char unicodeCh = '\u00DA'; // Gives accented U in unicode

        System.out.println(
                String.format("Integers (max/min): {%d} <-> {%d}",
                                Integer.MAX_VALUE,
                                Integer.MIN_VALUE));

        System.out.println(
                String.format("dataValue: {%d}, myVar: {%d}",
                                dataValue,
                                myVar));

        //Math operators: -, +, /, *, %
        System.out.println(bt + dataValue / myVar);

        //Type conversion:
        int k = bt; //byte to int -> widening
        System.out.println(k);

        byte btn = (byte) k; //int to byte -> narrowing
        System.out.println(btn);
    }
}
