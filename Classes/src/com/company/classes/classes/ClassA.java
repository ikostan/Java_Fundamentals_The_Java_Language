package com.company.classes.classes;

public class ClassA {

    private String className = this.getClass().getSimpleName();
    private int paramA;
    private int paramB;

    public ClassA(){

        System.out.println(className + " constructor called");
    }

    public ClassA(int newParamA, int newParamB){

        this();
        this.paramA = newParamA;
        this.paramB = newParamB;
    }

    public void methodA(){

        System.out.println("This is method from ClassA");
    }

    public int getParamA() {
        return paramA;
    }

    public void setParamA(int paramA) {
        this.paramA = paramA;
    }

    public int getParamB() {
        return paramB;
    }

    public void setParamB(int paramB) {
        this.paramB = paramB;
    }
}
