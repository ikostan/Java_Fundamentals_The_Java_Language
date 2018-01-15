package com.company.classes.classes;

import com.company.classes.classes.contracts.Payable;

public abstract class Worker implements Payable {

    //Class fields
    private String name;

    //Constructor
    public Worker(String name){
        this.name = name;
    }

    //Get payed (using design pattern "Template Method")
    @Override
    public void pay(){
        Money due = getAmmountDue();
    }

    //Ask derived class how much to pay
    abstract protected Money getAmmountDue();
}
