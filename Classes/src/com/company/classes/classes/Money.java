package com.company.classes.classes;

public class Money {

    private double value;
    private Currency currency;

    public Money(double value, Currency currency){
        this.setValue(value);
        this.setCurrency(currency);
    }

    private double normilized(){
        return currency ==
                Currency.USD ? value : value * currency.conversionRateTo(Currency.USD);
    }

    public boolean isGreaterThan(Money op){
        return (this.normilized() > op.normilized());
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
