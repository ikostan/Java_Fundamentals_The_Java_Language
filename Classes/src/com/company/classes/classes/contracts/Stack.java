package com.company.classes.classes.contracts;

public interface Stack<T>{
    void push(T item);
    T pop();
    void pushMany(T[] items);
    int size();
}
