package com.xworkz.task.runner;

import com.xworkz.task.Raincoat;
import com.xworkz.task.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella();
        Raincoat raincoat = new Raincoat(umbrella);
        raincoat.invoke();
    }
}
