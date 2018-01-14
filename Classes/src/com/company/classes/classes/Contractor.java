package com.company.classes.classes;

/*
* Worker that is not employed directly by the company
*/
public class Contractor extends Worker {

    private Invoice[] invoices;

    //Constructor
    public Contractor(String name) {
        super(name);
    }

    //Return salary rate
    @Override
    protected Money getAmmountDue() {
        //TODO
        return null;
    }

    //Add a new (unpaid) invoice
    public void attachInvoice(Invoice i){
        //TODO
    }
}
