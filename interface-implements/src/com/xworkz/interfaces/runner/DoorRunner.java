package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.SmartDoor;
import com.xworkz.interfaces.internal.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door door = new SmartDoor();
        door.open();
        door.close();
        door.lock();

        SmartDoor smartDoor = new SmartDoor();
        smartDoor.open();
        smartDoor.close();
        smartDoor.lock();
    }
}
