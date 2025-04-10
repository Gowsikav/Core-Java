package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bank;
import com.xworkz.overriding.internal.SBI;

public class BankRunner
{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.describe();

        SBI sbi = new SBI();
        sbi.describe();
        sbi.offerLoan();

        Bank bank1 = new SBI();
        bank1.describe();
    }
}
