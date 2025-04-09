package com.xworkz.acquired.external;

import com.xworkz.acquired.internal.Shoe;

public class NikeShoe extends Shoe
{
    public NikeShoe()
    {
        super();// it will work because we can invoke the superclass protected constructor using super
        System.out.println("Nikeshoe constructor");
        //Shoe shoe=new Shoe(); error we cannot use in different package with use of new
    }
}
