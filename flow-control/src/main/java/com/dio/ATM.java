package com.dio;

public class ATM {
    double balance = 25.0;
    
    public void requestWithdraw(double value) {
        
        System.out.println("Trying to withdraw: " + value);

        if (value < balance) {
            balance -= value;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Balance not enough (" + balance + ")");
        }

    }
}
