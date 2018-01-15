package com.company.javacollections;

public class MyClass{

    String label, value;

    public MyClass(String label, String value){
        this.label = label;
        this.value = value;
    }

    public boolean equals(Object o) {
        MyClass other = (MyClass) o;
        return value.equalsIgnoreCase(other.value);
    }
}
