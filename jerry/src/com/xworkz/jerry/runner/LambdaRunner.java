package com.xworkz.jerry.runner;

import com.xworkz.jerry.lambda.Bakery;
import com.xworkz.jerry.lambda.Tank;
import com.xworkz.jerry.lambda.TankUser;

public class LambdaRunner {

    public static void main(String[] args) {


        Bakery bakery=(time, by)->time!=null && by !=null;

        String open="11.30";
        boolean value=bakery.open(open,"Owner");
        System.out.println("value :"+value);

        Tank tank=(p1,p2)->p1-p2;

        TankUser tankUser=new TankUser();
        tankUser.take(tank);


        tankUser.take((p1,p2)->p1*p2);


    }
}
