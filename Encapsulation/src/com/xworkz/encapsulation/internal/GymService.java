package com.xworkz.encapsulation.internal;

public class GymService
{
    Gym gym;

    public GymService(Gym gym) {
        this.gym = gym;
        System.out.println("GymService Constructor");
    }

    public void setup() {
        gym.setName("FlexFit Gym");
        gym.setMembers(120);
        gym.setHasTrainer(true);
        gym.setLocation("Indiranagar");
        gym.setMonthlyFee(1500.0);

        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("Has Trainer: " + gym.isHasTrainer());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
    }
}
