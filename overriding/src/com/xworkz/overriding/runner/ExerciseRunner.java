package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Exercise;
import com.xworkz.overriding.internal.StrengthTraining;

public class ExerciseRunner {
    public static void main(String[] args) {
        Exercise generalExercise = new Exercise();
        generalExercise.describe();

        StrengthTraining strengthTraining = new StrengthTraining();
        strengthTraining.describe();
        strengthTraining.liftWeights();

        Exercise workout = new StrengthTraining();
        workout.describe();
    }
}
