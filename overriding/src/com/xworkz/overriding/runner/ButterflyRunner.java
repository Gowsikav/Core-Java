package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bookstore;
import com.xworkz.overriding.internal.Butterfly;

public class ButterflyRunner {
    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly();
        butterfly.describe();

        Bookstore store = new Bookstore();
        store.describe();
        store.openStore();

        Butterfly themedStore = new Bookstore();
        themedStore.describe();
    }
}
