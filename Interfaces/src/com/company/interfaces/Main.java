package com.company.interfaces;

public class Main {

    public static void main(String[] args) {

        try {

            Person p1 = new Person("John", "Doe");
            Person p2 = new Person("Bruce", "Lee", 30);

            System.out.println(p1.compareTo(p2) < 0 ? p1.getFirstName() + " is younger" : p2.getFirstName() + " is younger");
        }
        catch (Exception e){

            System.out.println(e.getMessage());
        }
    }
}
