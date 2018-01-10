package com.company.classes;

import com.company.classes.classes.ClassA;
import com.company.classes.classes.ClassB;
import com.company.classes.classes.ClassC;

public class Main {

    public static void main(String[] args) {

        //inheritSample();
        paramsSample();
    }

    private static void paramsSample(){

        ClassC a = new ClassC();
        a.setParamA(1);
        a.setParamB(2);
        a.methodC();
        System.out.println(String.format("a: %d, b: %d", a.getParamA(), a.getParamB()));

        swapValues(a);
        System.out.println(String.format("a: %d, b: %d", a.getParamA(), a.getParamB()));
    }

    private static void swapValues(ClassA a){

        int temp = a.getParamA();
        a.setParamA(a.getParamB());
        a.setParamB(temp);
    }

    private static void inheritSample(){

        ClassA ac = new ClassC();
        ClassA ab = new ClassB();
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        ClassB bc = new ClassC();

        testClass(ac);
        testClass(ab);
        testClass(a);
        testClass(b);
        testClass(c);
        testClass(bc);
    }

    private static void testClass(ClassA a){

        if(a instanceof ClassA &&
                a instanceof ClassB &&
                a instanceof ClassC){

            System.out.println(a.getClass().getSimpleName() + " " + "Instance of ClassA, ClassB, ClassC");
        }
        else if(a instanceof ClassA &&
                a instanceof ClassB){

            System.out.println(a.getClass().getSimpleName() + " " + "Instance of ClassA, ClassB");
        }
        else if(a instanceof ClassC &&
                a instanceof ClassB){

            System.out.println(a.getClass().getSimpleName() + " " + "Instance of ClassB, ClassC");
        }
        else if(a instanceof ClassA){

            System.out.println(a.getClass().getSimpleName() + " " + "Instance of ClassA");
        }
        else if(a instanceof ClassB){

            System.out.println(a.getClass().getSimpleName() + " " + "Instance of ClassB");
        }
        else if(a instanceof ClassC){

            System.out.println(a.getClass().getSimpleName() + " " + "Instance of ClassC");
        }
        else{

            System.out.println("Instance of ???");
        }
    }
}