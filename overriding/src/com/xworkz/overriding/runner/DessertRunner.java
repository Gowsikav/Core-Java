package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Cupcake;
import com.xworkz.overriding.internal.Dessert;

public class DessertRunner {
    public static void main(String[] args) {
        Dessert sweetItem = new Dessert();
        sweetItem.describe();

        Cupcake chocoCupcake = new Cupcake();
        chocoCupcake.describe();
        chocoCupcake.addFrosting();

        Dessert miniCake = new Cupcake();
        miniCake.describe();
    }
}
