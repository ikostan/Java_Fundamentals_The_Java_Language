package com.company.strings;

public class Main {

    public static void main(String[] args) {

        testEquality();
    }

    private static void testEquality(){

        String s0 = "Hello";
        String s1 = " World!";
        String s2 = s0 + s1;
        String s3 = "Hello World!";
        String s4 = s2.intern();
        String s5 = s2.intern();

        //System.out.println(s2);
        //System.out.println(s3);

        if(s2.equals(s3)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(s2 == s3){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(s4 == s5){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
