package com.xworkz.encapsulation.internal;

public class TankUnit
{
    Tank tank;

    public TankUnit(Tank tank) {
        this.tank = tank;
        System.out.println("TankUnit Constructor");
    }

    public void deploy() {
        tank.setModel("T-90");
        tank.setCapacity(3);
        tank.setType("Main Battle Tank");
        tank.setArmored(true);
        tank.setRange(550.5);

        System.out.println("Model: " + tank.getModel());
        System.out.println("Capacity: " + tank.getCapacity());
        System.out.println("Type: " + tank.getType());
        System.out.println("Armored: " + tank.isArmored());
        System.out.println("Range: " + tank.getRange());
    }
}
