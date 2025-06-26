package com.xworkz.jerry.lambda;

public class TankUser {


    public  void take(Tank tank)
    {
        System.out.println("in take of TankUser");
        double result =tank.sum(30,35);
        System.out.println("result :"+result);
    }
}
