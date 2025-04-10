package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bodega;
import com.xworkz.overriding.internal.Boots1;

public class BodegaRunner {
    public static void main(String[] args) {
        Bodega bodega = new Bodega();
        bodega.describe();

        Boots1 boots = new Boots1();
        boots.describe();
        boots.laceUp();

        Bodega ruggedStyle = new Boots1();
        ruggedStyle.describe();
    }
}
