package com.company.classes.classes;

/*
* This class will pay salaries for workers
*/
public class AccountsPayable {

    //List of creditors
    Payable[] creditors;

    //Pay salary for all
    public void PayEvrybody(){
        for(Payable c : creditors){
            c.pay();
        }
    }
}
