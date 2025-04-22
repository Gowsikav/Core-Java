package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.Car;
import com.xworkz.interfaces.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.honk();
        vehicle.stop();

        Car car = new Car();
        car.start();
        car.accelerate();
        car.brake();
        car.honk();
        car.stop();
    }
}
