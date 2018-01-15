package com.company.classes.classes.LiskovSubstitution;

import java.util.ArrayList;

public class Stack<T> extends ArrayList<T> {

    private int stackPointer;

    public void push(T item){
        add(stackPointer++, item);
    }

    public T pop(){
        return remove(--stackPointer);
    }
}
