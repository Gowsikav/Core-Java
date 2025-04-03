package com.xworkz.task.runner;

import com.xworkz.task.Cigarette;
import com.xworkz.task.Smoker;

public class CigaretteRunner {
    public static void main(String[] args) {
        Cigarette cigarette = new Cigarette();
        Smoker smoker = new Smoker(cigarette);
        smoker.invoke();
    }
}
