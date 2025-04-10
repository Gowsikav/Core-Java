package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Drink;
import com.xworkz.overriding.internal.Lemonade;

public class DrinkRunner {
    public static void main(String[] args) {
        Drink beverage = new Drink();
        beverage.describe();

        Lemonade summerSip = new Lemonade();
        summerSip.describe();
        summerSip.serveChilled();

        Drink refreshing = new Lemonade();
        refreshing.describe();
    }
}
