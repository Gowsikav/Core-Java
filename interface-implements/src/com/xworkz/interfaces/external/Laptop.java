package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Computer;

public class Laptop implements Computer {

    @Override
    public void boot() {
        System.out.println("Laptop booting up");
    }

    @Override
    public void shutdown() {
        System.out.println("Laptop shutting down");
    }

    @Override
    public void sleep() {
        System.out.println("Laptop sleeping");
    }

    @Override
    public void restart() {
        System.out.println("Laptop restarting");
    }

    @Override
    public void openApp(String appName) {
        System.out.println("Opening " + appName + " on Laptop");
    }
}
