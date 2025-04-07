package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Comb;

public class Customer
{
    public Customer() {
        System.out.println("Customer constructor");
    }

    public void getStyled() {
        System.out.println("running in getStyled method");
        Comb comb = new Comb();
        comb.use();
    }
}
