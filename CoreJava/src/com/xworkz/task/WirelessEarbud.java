package com.xworkz.task;

public class WirelessEarbud {
    Earbud earbud;

    public WirelessEarbud(Earbud earbud) {
        System.out.println("Constructor in WirelessEarbud");
        this.earbud = earbud;
    }

    public void invoke() {
        System.out.println("Invoking method in Earbud");
        if (earbud != null) {
            earbud.playMusic();
        } else {
            System.out.println("Earbud is null");
        }
    }
}
