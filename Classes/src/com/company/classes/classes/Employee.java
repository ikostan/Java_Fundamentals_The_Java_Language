package com.company.classes.classes;

import com.company.classes.classes.contracts.Timesheet;

class Employee extends Worker{

    private Timesheet[] unpaidTimesheets;

    //Constructor
    public Employee(String name){
        super(name);
    }

    //Return salary rate
    @Override
    protected Money getAmmountDue() {
        return new Money(12.34, Currency.USD);
    }

    //Add unpaid timesheet
    public void attachTimesheet(Timesheet i){
        //TODO
    }
}
