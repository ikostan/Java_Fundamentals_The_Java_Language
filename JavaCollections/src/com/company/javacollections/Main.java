package com.company.javacollections;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //sampleArrayList();
        //sampleSafeType();
        sampleCollInterface();
    }

    //Collection Interface
    private static void sampleCollInterface(){


    }

    //Collection sample - basic ArrayList (has no type)
    private static void sampleArrayList(){

        ArrayList arrList = new ArrayList();
        arrList.add("Foo");
        arrList.add("Bar");

        //Print all members
        System.out.println("Elements: " + arrList.size());
        for (Object o : arrList){
            System.out.println(o.toString());
        }

        //Print by index
        System.out.println(arrList.get(0));
    }

    //Collections and type safety:
    private static void sampleSafeType(){

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Foo");
        arrList.add("Bar");
        //arrList.add(1); //Invalid because it does not match the data type

        //Print all members
        System.out.println("Elements: " + arrList.size());
        for (String o : arrList){
            System.out.println(o);
        }

        //Print by index
        System.out.println(arrList.get(0));
    }
}
