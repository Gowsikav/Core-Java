package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bathrobe;
import com.xworkz.overriding.internal.Berries;

public class Bathroberunner
{
    public static void main(String[] args) {
        Bathrobe robe = new Bathrobe();
        robe.describe();

        Berries berryRobe = new Berries();
        berryRobe.describe();
        berryRobe.smellFresh();

        Bathrobe freshStyle = new Berries();
        freshStyle.describe();
    }
}
