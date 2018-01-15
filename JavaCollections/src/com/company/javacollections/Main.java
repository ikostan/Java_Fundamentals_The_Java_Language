package com.company.javacollections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //sampleArrayList();
        //sampleSafeType();
        //sampleCollInterface();
        //sampleLambda();
        sampleConversion();
    }

    //Sorting common collections
    //Common Collection Types: Collection, List, Queue, Set, SortedSet
    private static void sampleSorting(){

        TreeSet<MyClass> tree = new TreeSet<>();
        tree.add(new MyClass("v1", "abc"));
        tree.add(new MyClass("v2", "sdf"));
        tree.add(new MyClass("v3", "vbn"));
    }

    //Converting between collections and Arrays
    private static void sampleConversion(){

        //Retrieving an Array:
        ArrayList<MyClass> list = new ArrayList<>();
        list.add(new MyClass("v1", "abc"));
        list.add(new MyClass("v2", "xyz"));
        list.add(new MyClass("v3", "abc"));

        //Conversion with no type predefined
        Object[] objArray = list.toArray();

        //Conversion with predefined type
        MyClass[] a1 = list.toArray(new MyClass[3]);

        //Convert Array to a List:
        MyClass[] myList = new MyClass[]{
                new MyClass("v1", "abc"),
                new MyClass("v2", "xyz"),
                new MyClass("v3", "abc")
        };

        Collection<MyClass> cList = Arrays.asList(myList);
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
