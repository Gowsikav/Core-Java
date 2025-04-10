package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bag1;
import com.xworkz.overriding.internal.Handbag;

public class Bag1Runner {
    public static void main(String[] args) {
        Bag1 simpleBag = new Bag1();
        simpleBag.describe();

        Handbag stylishBag = new Handbag();
        stylishBag.describe();
        stylishBag.open();

        Bag1 designerBag = new Handbag();
        designerBag.describe();
    }
}
