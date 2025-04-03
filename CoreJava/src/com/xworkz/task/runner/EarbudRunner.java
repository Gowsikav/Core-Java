package com.xworkz.task.runner;

import com.xworkz.task.Earbud;
import com.xworkz.task.WirelessEarbud;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud = new Earbud();
        WirelessEarbud wirelessEarbud = new WirelessEarbud(earbud);
        wirelessEarbud.invoke();
    }
}
