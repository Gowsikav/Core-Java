package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Powder;

public class ShopKeeper
{
    public ShopKeeper() {
        System.out.println("Shopkeeper constructor");
    }

    public void sellProduct() {
        System.out.println("running in sellProduct method");
        Powder powder = new Powder();
        powder.apply();
    }
}
