package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bin;
import com.xworkz.overriding.internal.Brassiere;

public class BinRunner {
    public static void main(String[] args) {
        Bin bin = new Bin();
        bin.describe();

        Brassiere bra = new Brassiere();
        bra.describe();
        bra.fold();

        Bin smartStorage = new Brassiere();
        smartStorage.describe();
    }
}
