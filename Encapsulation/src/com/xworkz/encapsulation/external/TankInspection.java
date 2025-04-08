package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Tank;

public class TankInspection
{
    Tank tank;

    public TankInspection(Tank tank) {
        this.tank = tank;
        System.out.println("TankInspection Constructor");
    }

    public void inspect() {
        System.out.println("Model: " + tank.getModel());
        System.out.println("Capacity: " + tank.getCapacity());
        System.out.println("Type: " + tank.getType());
        System.out.println("Armored: " + tank.isArmored());
        System.out.println("Range: " + tank.getRange());
    }
}
