package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Door;

public class SmartDoor implements Door {

    @Override
    public void open() {
        System.out.println("SmartDoor is opening");
    }

    @Override
    public void close() {
        System.out.println("SmartDoor is closing");
    }

    @Override
    public void lock() {
        System.out.println("SmartDoor is locked");
    }
}
