package com.company.classes.classes;

import com.company.classes.classes.contracts.Invoice;

/*
* Worker that is not employed directly by the company
*/
class Contractor extends Worker {

    private Invoice[] invoices;

    //Constructor
    public Contractor(String name) {
        super(name);
    }

    //Return salary rate
    @Override
    protected Money getAmmountDue() {
        return new Money(16.5, Currency.USD);
    }

    //Add a new (unpaid) invoice
    public void attachInvoice(Invoice i){
        //TODO
    }
}
