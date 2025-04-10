package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.CheeseBurger;
import com.xworkz.overriding.internal.Hamburger;

public class HamburgerRunner {
    public static void main(String[] args) {
        Hamburger basicHamburger = new Hamburger();
        basicHamburger.describe();

        CheeseBurger cheesyBurger = new CheeseBurger();
        cheesyBurger.describe();
        cheesyBurger.addCheese();

        Hamburger gourmetBurger = new CheeseBurger();
        gourmetBurger.describe();
    }
}
