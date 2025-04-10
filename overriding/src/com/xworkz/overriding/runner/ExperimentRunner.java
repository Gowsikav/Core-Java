package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.ChemicalTest;
import com.xworkz.overriding.internal.Experiment;

public class ExperimentRunner {
    public static void main(String[] args) {
        Experiment basicExperiment = new Experiment();
        basicExperiment.describe();

        ChemicalTest acidBaseTest = new ChemicalTest();
        acidBaseTest.describe();
        acidBaseTest.mixReagents();

        Experiment reactionTest = new ChemicalTest();
        reactionTest.describe();
    }
}
