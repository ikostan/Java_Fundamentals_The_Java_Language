package com.company.javacollections;

import java.util.Comparator;

public class MyComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.value.compareToIgnoreCase(o2.value);
    }
}
