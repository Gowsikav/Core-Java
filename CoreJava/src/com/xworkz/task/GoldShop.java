package com.xworkz.task;

public class GoldShop {
    Gold gold;
    public GoldShop(Gold gold)
    {
        System.out.println("constructor in GoldShop");
        this.gold=gold;
    }
    public void invoke()
    {
        System.out.println("Invoking method in Gold");
        if(gold!=null)
        {
            gold.carat();
        }
        else
        {
            System.out.println("Gold is null");
        }

    }

}
