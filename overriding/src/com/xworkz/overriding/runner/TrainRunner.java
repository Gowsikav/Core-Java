package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.ElectricTrain;
import com.xworkz.overriding.internal.Train;

public class TrainRunner {
    public static void main(String[] args) {
        Train basicTrain = new Train();
        basicTrain.describe();

        ElectricTrain electricTrain = new ElectricTrain();
        electricTrain.describe();
        electricTrain.chargeBattery();

        Train ecoTrain = new ElectricTrain();
        ecoTrain.describe();
    }
}
