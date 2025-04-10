package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bread;
import com.xworkz.overriding.internal.Brogan;

public class BreadRunner {
    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.describe();

        Brogan brogan = new Brogan();
        brogan.describe();
        brogan.wear();

        Bread bakeryShoe = new Brogan();
        bakeryShoe.describe();

    }
}
