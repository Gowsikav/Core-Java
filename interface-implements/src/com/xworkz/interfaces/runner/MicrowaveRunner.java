package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.KitchenMicrowave;
import com.xworkz.interfaces.internal.Microwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Microwave microwave = new KitchenMicrowave();
        microwave.setTimer(30);
        microwave.start();
        microwave.stop();

        KitchenMicrowave kitchenMicrowave = new KitchenMicrowave();
        kitchenMicrowave.setTimer(45);
        kitchenMicrowave.start();
        kitchenMicrowave.stop();
    }
}
