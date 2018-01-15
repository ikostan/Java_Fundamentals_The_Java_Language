package com.company.javacollections;

import java.util.Comparator;

public class MyLabelComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.label.compareToIgnoreCase(o2.label);
    }
}
