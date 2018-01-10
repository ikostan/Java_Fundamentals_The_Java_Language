package com.company.classes.classes;

public class ClassA {

    private String className = this.getClass().getSimpleName();
    private String param;

    public ClassA(){

        System.out.println(className + " constructor called");
    }

    public ClassA(String newParam){

        this();
        this.param = newParam;
    }

    public void methodA(){

        System.out.println("This is method from ClassA");
    }
}
