package com.company.classes.classes;

public abstract class Worker {

    //Class fields
    private String name;

    //Constructor
    public Worker(String name){
        this.name = name;
    }

    //Get payed (using design pattern "Template Method")
    public void pay(){
        Money due = getAmmountDue();
    }

    //Ask derived class how much to pay
    abstract protected Money getAmmountDue();
}
