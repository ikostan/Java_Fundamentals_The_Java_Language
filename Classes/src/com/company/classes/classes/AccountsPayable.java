package com.company.classes.classes;

import com.company.classes.classes.contracts.Payable;

/*
* This class will pay salaries for workers
*/
class AccountsPayable {

    //List of creditors
    Payable[] creditors;

    //Pay salary for all
    public void PayEvrybody(){
        for(Payable c : creditors){
            c.pay();
        }
    }
}
