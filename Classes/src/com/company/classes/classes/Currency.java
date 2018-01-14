package com.company.classes.classes;

public enum Currency {
    USD, EURO;

    //Conversion rate between currencies
    public double conversionRateTo(Currency target){
        return 1.0;
    }
}
