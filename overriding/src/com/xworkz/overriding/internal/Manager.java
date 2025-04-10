package com.xworkz.overriding.internal;

public class Manager extends Employee1{
    public Manager() {
        System.out.println("Manager constructor");
    }

    @Override
    public void describe() {
        System.out.println("This is a manager who leads a team.");
    }

    public void manageTeam() {
        System.out.println("Managing the team efficiently.");
    }
}
