package com.company.classes;

import com.company.classes.classes.ClassA;
import com.company.classes.classes.ClassB;
import com.company.classes.classes.ClassC;
import com.company.classes.classes.Money;
import com.company.classes.classes.Currency;


public class Main {

    public static void main(String[] args) {

        //inheritSample();
        //paramsSample();
        //strBuilderSample();
        //testMoneyClass();
    }

    private  static  void testMoneyClass(){

        Money balance = new Money(1.0, Currency.EURO);
        Money request = new Money(3.0, Currency.USD);

        if(balance.isGreaterThan(request)){
            dispenseFunds(request);
        }
        else{
            System.out.println("You have no enough balance!");
        }

        /*
        OLD code

        double normalizedBalance =
                balance.getValue() * balance.getCurrency().conversionRateTo(Currency.USD);
        double normalizedRequest =
                request.getValue() * request.getCurrency().conversionRateTo(Currency.USD);

        if(normalizedBalance > normalizedRequest){

            dispenseFunds(request);
        }
        else{

            System.out.println("You have no enough balance!");
        }
         */
    }

    private static void dispenseFunds(Money amount){

        //TODO
    }

    private static void strBuilderSample(){

        int maxChars = 40;
        StringBuilder sb = new StringBuilder(maxChars);
        System.out.println("Max capacity: " + sb.capacity());
        sb.append("Hello");
        System.out.println(sb);
        sb.append(" World!");
        System.out.println(sb);
        int indx = sb.indexOf(" ");
        sb.insert(indx, " My");
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println(sb);

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
