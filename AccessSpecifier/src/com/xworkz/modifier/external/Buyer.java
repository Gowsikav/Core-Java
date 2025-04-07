package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Perfume;

public class Buyer
{
    public Buyer() {
        System.out.println("Customer constructor");
    }

    public void buyPerfume() {
        System.out.println("running in buyPerfume method");
        Perfume perfume = new Perfume();
        perfume.spray();
    }
}
