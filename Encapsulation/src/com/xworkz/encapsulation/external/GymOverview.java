package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.Gym;

public class GymOverview
{
    Gym gym;

    public GymOverview(Gym gym) {
        this.gym = gym;
        System.out.println("GymOverview Constructor");
    }

    public void show() {
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("Has Trainer: " + gym.isHasTrainer());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
    }
}
