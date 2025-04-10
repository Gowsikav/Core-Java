package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Car;
import com.xworkz.overriding.internal.Vehicle;

public class VehicleRunner
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle();
        vehicle.describe();

        Car car = new Car();
        car.describe();
        car.drive();

        Vehicle vehicle1 = new Car();
        vehicle1.describe();

    }
}
