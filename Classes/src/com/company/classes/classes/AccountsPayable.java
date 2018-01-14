package com.company.classes.classes;

/*
* This class will pay salaries for workers
*/
public class AccountsPayable {

    Worker[] workers;

    //Pay salary for all
    public void PayEvrybody(){
        for(Worker w : workers){
            w.pay();
        }
    }
}
