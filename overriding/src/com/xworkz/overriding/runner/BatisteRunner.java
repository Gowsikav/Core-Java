package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Barge;
import com.xworkz.overriding.internal.Batiste;

public class BatisteRunner {
    public static void main(String[] args) {
        Batiste fabric = new Batiste();
        fabric.describe();

        Barge barge = new Barge();
        barge.describe();
        barge.sail();

        Batiste luxuryTransport = new Barge();
        luxuryTransport.describe();
    }
}
