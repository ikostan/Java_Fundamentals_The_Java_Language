package com.company.javacollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //sampleArrayList();
        //sampleSafeType();
        //sampleCollInterface();
        sampleLambda();
    }

    //Java 8 features: Lambda
    private static void sampleLambda(){

        ArrayList<MyClass> arrList = new ArrayList<>();
        MyClass v1 = new MyClass("v1", "abc");
        MyClass v2 = new MyClass("v2", "xyz");
        MyClass v3 = new MyClass("v3", "abc");
        arrList.add(v1);
        arrList.add(v2);
        arrList.add(v3);

        //Lambda expression: forEach
        arrList.forEach((m) -> System.out.println(m.label));

        //Lambda expression: removeIf
        arrList.removeIf((m) -> m.value.equals("abc"));
        System.out.println();
        arrList.forEach((m) -> System.out.println(m.label));
    }

    //Collection Interface: size, clear, isEmpty, add, addAll
    private static void sampleCollInterface(){

        ArrayList<String> arrList = new ArrayList<>();
        arrList.clear();
        arrList.add("Foo");
        arrList.add("Bar");

        LinkedList<String> lnkList = new LinkedList<>();
        lnkList.add("Foo");
        lnkList.add("Bar");

        arrList.addAll(lnkList);

        if(lnkList.isEmpty() == false){
            for (String s : arrList){
                System.out.println(s);
            }
        }
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
