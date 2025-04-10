package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Armchair;
import com.xworkz.overriding.internal.Recliner;

public class Armchairrunner {
    public static void main(String[] args) {
        Armchair basicChair = new Armchair();
        basicChair.describe();

        Recliner lazyBoy = new Recliner();
        lazyBoy.describe();
        lazyBoy.adjustPosition();

        Armchair comfyChair = new Recliner();
        comfyChair.describe();
    }
}
