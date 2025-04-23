package com.xworkz.multiple.abstractclass;



public abstract class Hospital {
    public Hospital()
    {
        System.out.println("Hospital constructor");
    }
    public abstract void service();
    public void medicine()
    {
        System.out.println("Medicine ");
    }

    public static void run(){
        System.out.println("static run");
    }
    public final void display()
    {
        System.out.println("final display");
    }
}
