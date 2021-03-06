package com.company.classes;

import com.company.classes.classes.*;
import com.company.classes.classes.LiskovSubstitution.MonitorableStack;
import com.company.classes.classes.LiskovSubstitution.SimpleStack;
import com.company.classes.classes.basics.ClassA;
import com.company.classes.classes.basics.ClassB;
import com.company.classes.classes.basics.ClassC;
import com.company.classes.classes.contracts.Payable;
import com.company.classes.classes.shapes.*;


public class Main {

    public static void main(String[] args) {

        //inheritSample();
        //paramsSample();
        //strBuilderSample();
        //testMoneyClass();
        //sampleDelegation();
        testStack();
        sampleInterfaces();
    }

    //Using Interface instead of Inheritance
    private static void sampleInterfaces(){

        Payable[] workers = new Payable[]{
                new Vendor(),
                new Volunteer(),
                new TemporaryEmployee(),
                new Employee("John"),
                new Contractor("Bill"),
        };

        for (Payable w : workers){
            w.pay();
        }
    }

    private static void testStack(){

        SimpleStack<String> myStack = new SimpleStack<>();
        myStack.push("0");
        String s = myStack.pop();
        System.out.println(s);

        //Demo of fragile base class:
        MonitorableStack<String> myMonitorableStack = new MonitorableStack<>();
        myMonitorableStack.pushMany(new String[]{"0", "1"});
        assert myMonitorableStack.maximumSizeSoFar() == 2:
                "Unexpected max size" + myMonitorableStack.maximumSizeSoFar();
    }

    private static void sampleDelegation(){

        Circle[] circles = new Circle[]{};

        for (Circle c : circles){
            //TODO
            //c.draw(Graphics g);
        }
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
