package com.company.classes.classes.LiskovSubstitution;

import com.company.classes.classes.contracts.Stack;


public class SimpleStack<T> implements Stack<T>{
    //ArrayList<T> contents = new ArrayList<>();
    T[] contents = (T[]) new Object[1000];
    private int stackPointer = 0;

    public void push(T item){
        //this.contents.add(stackPointer++, item);
        assert  stackPointer < contents.length : "push to full stack";
        contents[stackPointer++] = item;
    }

    public T pop(){
        //return this.contents.remove(--stackPointer);
        assert stackPointer > 0 : "pop from empty stack";
        return contents[--stackPointer];
    }

    public void pushMany(T[] items){
        /*
        for (T i : items){
            this.push(i);
        }
        */
        assert (stackPointer + items.length) <= contents.length : "too many items";
        System.arraycopy(items, 0, contents, stackPointer, items.length);
        stackPointer += items.length;
    }

    public int size(){
        //return contents.length;
        return stackPointer;
    }
}
