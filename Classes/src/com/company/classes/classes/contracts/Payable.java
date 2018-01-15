package com.company.classes.classes.contracts;

/*
* Used to connect between AccountsPayable and Worker
*/
public interface Payable {
    void pay();

    //Class that provides a default method implementation
    public static class Implementation implements Payable{
        @Override
        public void pay() {
            //TODO
        }
    }
}
