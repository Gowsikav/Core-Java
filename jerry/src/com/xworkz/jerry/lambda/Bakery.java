package com.xworkz.jerry.lambda;

@FunctionalInterface
public interface Bakery {

    //DONT ADD any new Abstract methods
    boolean open(String time,String by);

    //boolean close(String time,String by);
}
