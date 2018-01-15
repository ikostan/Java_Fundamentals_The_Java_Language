package com.company.classes.classes;

import com.company.classes.classes.contracts.Payable;

public class Volunteer implements Payable {

    //Delegate
    private Payable delegate = new Payable.Implementation();

    //Using delegate in order to implement method
    @Override
    public void pay() {
        delegate.pay();
    }
}
