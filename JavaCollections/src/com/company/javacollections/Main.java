package com.company.javacollections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //sampleArrayList();
        //sampleSafeType();
        //sampleCollInterface();
        //sampleLambda();
        //sampleConversion();
        sampleSorting();
    }

    //Sorting common collections
    //Common Collection Types: Collection, List, Queue, Set, SortedSet
    private static void sampleSorting(){

        //Will be automatically sorted by value
        TreeSet<MyClass> tree = new TreeSet<>();
        tree.add(new MyClass("v1", "def"));
        tree.add(new MyClass("v2", "dhi"));
        tree.add(new MyClass("v3", "abc"));

        tree.forEach((m) -> System.out.println(m));
        System.out.println();

        //Will be automatically sorted by label
        TreeSet<MyClass> tree2 = new TreeSet<>(new MyLabelComparator());
        tree2.add(new MyClass("v3", "def"));
        tree2.add(new MyClass("v2", "dhi"));
        tree2.add(new MyClass("v1", "abc"));

        tree2.forEach((m) -> System.out.println(m));
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
