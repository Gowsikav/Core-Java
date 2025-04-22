package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Microwave;

public class KitchenMicrowave implements Microwave {

    @Override
    public void start() {
        System.out.println("KitchenMicrowave started");
    }

    @Override
    public void stop() {
        System.out.println("KitchenMicrowave stopped");
    }

    @Override
    public void setTimer(int seconds) {
        System.out.println("KitchenMicrowave timer set to " + seconds + " seconds");
    }
}
