package com.company.classes.classes.LiskovSubstitution;

import com.company.classes.classes.contracts.Stack;

//public class MonitorableStack<T> extends SimpleStack<T> { //This one causes fragility to the class
public class MonitorableStack<T> implements Stack<T>{

    //Max size
    private int highWaterMark = 0;

    //Delegate
    private SimpleStack<T> stack = new SimpleStack<>();

    @Override
    public void pushMany(T[] items) {
        stack.pushMany(items);
        if(stack.size() > highWaterMark){

            highWaterMark = stack.size();
        }
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public T pop() {
        return stack.pop();
    }

    public int maximumSizeSoFar(){
        return this.highWaterMark;
    }

    @Override
    public void push(T item){
        if(size() > this.highWaterMark){
            highWaterMark = size();
        }

        //super.push(item);
        stack.push(item);
    }

    //Inherit push() and pushMany()
}
