package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.BathRobe1;
import com.xworkz.overriding.internal.LuxuryRobe;

public class Bathrobe1Runner {
    public static void main(String[] args) {
        BathRobe1 standard = new BathRobe1();
        standard.describe();

        LuxuryRobe deluxe = new LuxuryRobe();
        deluxe.describe();
        deluxe.warmUp();

        BathRobe1 cozy = new LuxuryRobe();
        cozy.describe();
    }
}
