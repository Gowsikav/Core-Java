package com.xworkz.task.runner;

import com.xworkz.task.Gold;
import com.xworkz.task.GoldShop;

public class GoldRunner{
    public static void main(String[] args) {

        Gold gold=new Gold();
        GoldShop goldshop=new GoldShop(gold);
        goldshop.invoke();
    }
}
