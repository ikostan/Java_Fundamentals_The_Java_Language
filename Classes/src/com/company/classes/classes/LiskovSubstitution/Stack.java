package com.company.classes.classes.LiskovSubstitution;

import java.util.ArrayList;

public class Stack<T>{

    private ArrayList<T> contents = new ArrayList<>();
    private int stackPointer = 0;

    public void push(T item){
        this.contents.add(stackPointer++, item);
    }

    public T pop(){
        return this.contents.remove(--stackPointer);
    }
}
