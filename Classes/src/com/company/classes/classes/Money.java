package com.company.classes.classes;

public class Money {

    //Class fields:
    private double value;
    private Currency currency;

    //Constructor:
    public Money(double value, Currency currency){
        this.value = value;
        this.currency= currency;
    }

    //Currency converter:
    private double normilized(){
        return currency ==
                Currency.USD ? value : value * currency.conversionRateTo(Currency.USD);
    }

    //Comparator:
    public boolean isGreaterThan(Money op){
        return (this.normilized() > op.normilized());
    }
}
