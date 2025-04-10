package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bikini;
import com.xworkz.overriding.internal.Boucle;

public class BoucleRunner {
    public static void main(String[] args) {
        Boucle boucle = new Boucle();
        boucle.describe();

        Bikini beachwear = new Bikini();
        beachwear.describe();
        beachwear.swim();

        Boucle fancyWear = new Bikini();
        fancyWear.describe();
    }
}
