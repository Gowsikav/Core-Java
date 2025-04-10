package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Clothing;
import com.xworkz.overriding.internal.Shirt;

public class ClothingRunner
{
    public static void main(String[] args) {
        Clothing clothing = new Clothing();
        clothing.describe();

        Shirt shirt = new Shirt();
        shirt.describe();
        shirt.wear();

        Clothing clothing1 = new Shirt();
        clothing1.describe();
    }
}
