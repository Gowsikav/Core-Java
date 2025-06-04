package com.xworkz.checked.runner;

import com.xworkz.checked.exception.InsufficientBalanceException;

import java.rmi.RemoteException;

public class BalanceCheck {
    public static void main(String[] args) throws InsufficientBalanceException,RemoteException {
        double balanceAmount=0;
        if(balanceAmount<0)
        {
            throw new InsufficientBalanceException("Balance is invalid");
        }
        else {
            System.out.println("Balance is correct");
        }
        display();
    }
    public static void display() throws RemoteException
    {
        throw new RemoteException();
    }
}
