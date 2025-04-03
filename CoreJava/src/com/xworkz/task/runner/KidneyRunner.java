package com.xworkz.task.runner;

import com.xworkz.task.HumanKidney;
import com.xworkz.task.Kidney;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        HumanKidney humanKidney = new HumanKidney(kidney);
        humanKidney.invoke();
    }
}
