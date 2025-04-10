package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Blinds;
import com.xworkz.overriding.internal.BlueJeans;

public class BlindsRunner {
    public static void main(String[] args) {
        Blinds blinds = new Blinds();
        blinds.describe();

        BlueJeans jeans = new BlueJeans();
        jeans.describe();
        jeans.wear();

        Blinds stylishLook = new BlueJeans();
        stylishLook.describe();
    }
}
