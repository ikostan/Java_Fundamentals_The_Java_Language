package com.company.classes.classes.LiskovSubstitution;

public class MonitorableStack<T> extends Stack<T> {

    //Max size
    private int highWaterMark = 0;

    public int maximumSizeSoFar(){
        return this.highWaterMark;
    }

    @Override
    public void push(T item){
        if(size() > this.highWaterMark){
            highWaterMark = size();
        }

        super.push(item);
    }

    //Inherit push() and pushMany()
}
